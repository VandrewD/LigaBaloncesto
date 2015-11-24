package com.example.Service;

import com.example.Model.Liga;
import com.example.Repository.EquipoRepository;
import com.example.Repository.LigaRepository;
import com.example.Repository.TemporadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by jhipster on 4/11/15.
 */
@Service
@Transactional
public class LigaService {
    @Autowired
    private LigaRepository ligaRepository;
    @Autowired
    private TemporadaRepository temporadaRepository;

    public void testLiga() {

        Liga liga = new Liga();
        liga.setName("Liga WWE");
        ligaRepository.save(liga);

        Liga liga2 = new Liga();
        liga2.setName("Liga ABC");
        ligaRepository.save(liga2);
    }
}
