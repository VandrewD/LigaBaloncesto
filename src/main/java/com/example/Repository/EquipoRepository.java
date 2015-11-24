package com.example.Repository;

import com.example.Model.Equipo;
import com.example.Model.Jugador;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * Created by jhipster on 21/10/15.
 */
@Repository
public interface EquipoRepository extends PagingAndSortingRepository<Equipo, Long>{

   public List<Equipo> findByNameContaining (String name);
   public List<Equipo> findByLocalidadContaining (String name);
   


}
