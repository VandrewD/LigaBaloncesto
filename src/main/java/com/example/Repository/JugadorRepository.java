package com.example.Repository;

import com.example.Model.Jugador;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * Created by jhipster on 8/10/15.
 */
@Repository
public interface JugadorRepository extends PagingAndSortingRepository<Jugador, Long>{

     List<Jugador> findByNameContaining (String name);

     List<Jugador> findBycanastasTotalesGreaterThanEqual (Integer canastas_totales);

    List<Jugador> findByAsistenciasTotalesBetween (Integer minasistencias_totales, Integer maxasistencias_totales);

    List<Jugador> findByposicionEquals (String posicion);

    List<Jugador> findByfechaNacimientoLessThan (Date fechaNacimiento);

    List<Jugador> findByCanastasTotalesGreaterThanEqualAndFechaNacimientoBefore (Integer canastasTotales, Date fechaNacimiento);
}
