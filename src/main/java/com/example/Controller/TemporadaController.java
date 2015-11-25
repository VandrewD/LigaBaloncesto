package com.example.Controller;

import com.example.Model.Temporada;
import com.example.Repository.TemporadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by jhipster on 25/11/15.
 */
@RestController //SIRVE PARA SABER QUE ES UN CONTROLADOR
@RequestMapping("/temporadas")  //URL RELATIVA PARA ACCEDER AL CONTROLADOR
public class TemporadaController {
    @Autowired
    private TemporadaRepository temporadaRepository;


    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Temporada save(@RequestBody Temporada temporada) {
        return temporadaRepository.save(temporada);
    }

    @RequestMapping(method= RequestMethod.GET)
    public List<Temporada> findAll() {
        List<Temporada> temporadas = new ArrayList<Temporada>();
        Iterator<Temporada> iterator = temporadaRepository.findAll().iterator();

        while (iterator.hasNext()) {
            temporadas.add(iterator.next());
        }

        return temporadas;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable Long id) {
        Temporada temporadas = temporadaRepository.findOne(id);

        if(temporadas == null);

        temporadaRepository.delete(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Temporada updateById(@PathVariable Long id, @RequestBody Temporada temporada) {
        Temporada d1 = temporadaRepository.findOne(id);

        if(d1 == null);

        return temporadaRepository.save(temporada);
    }
}