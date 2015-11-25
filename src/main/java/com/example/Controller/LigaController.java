package com.example.Controller;

import com.example.Model.Liga;
import com.example.Repository.LigaRepository;
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
@RequestMapping("/ligas")  //URL RELATIVA PARA ACCEDER AL CONTROLADOR
public class LigaController {
    @Autowired
    private LigaRepository ligaRepository;


    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Liga save(@RequestBody Liga liga) {
        return ligaRepository.save(liga);
    }

    @RequestMapping(method= RequestMethod.GET)
    public List<Liga> findAll() {
        List<Liga> ligas = new ArrayList<Liga>();
        Iterator<Liga> iterator = ligaRepository.findAll().iterator();

        while (iterator.hasNext()) {
            ligas.add(iterator.next());
        }

        return ligas;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable Long id) {
        Liga ligas = ligaRepository.findOne(id);

        if(ligas == null);

        ligaRepository.delete(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Liga updateById(@PathVariable Long id, @RequestBody Liga liga) {
        Liga d1 = ligaRepository.findOne(id);

        if(d1 == null);

        return ligaRepository.save(liga);
    }
}