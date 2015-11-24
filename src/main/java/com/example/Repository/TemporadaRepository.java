package com.example.Repository;

import com.example.Model.Jugador;
import com.example.Model.Liga;
import com.example.Model.Temporada;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by jhipster on 4/11/15.
 */
@Repository
public interface TemporadaRepository  extends PagingAndSortingRepository<Temporada, Long> {

    List<Temporada> findByNameContaining (String name);
}
