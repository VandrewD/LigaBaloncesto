package com.example.Service;

import com.example.Model.Liga;
import com.example.Model.Temporada;
import com.example.Repository.LigaRepository;
import com.example.Repository.TemporadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by jhipster on 5/11/15.
 */
@Service
@Transactional
public class TemporadaService {
    @Autowired
    private TemporadaRepository temporadaRepository;
    @Autowired
    private LigaRepository ligaRepository;

    public void testTemporada() {

        Temporada temporada = new Temporada();
        temporada.setName("2015-2016");
        temporadaRepository.save(temporada);

        //afegir equipos a temporada

        Liga liga = ligaRepository.findByNameContaining("Liga WWE").get(0);
        temporada.setLiga(liga);
        ligaRepository.save(liga);



        Temporada temporada2 = new Temporada();
        temporada2.setName("1992-1993");
        temporadaRepository.save(temporada2);

        Liga liga2 = ligaRepository.findByNameContaining("Liga ABC").get(0);
        temporada2.setLiga(liga2);
        ligaRepository.save(liga2);
    }
}
