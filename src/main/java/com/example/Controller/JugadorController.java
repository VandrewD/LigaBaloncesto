package com.example.Controller;

import com.example.Model.Jugador;
import com.example.Repository.JugadorRepository;
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
@RequestMapping("/jugadores")  //URL RELATIVA PARA ACCEDER AL CONTROLADOR
public class JugadorController {
    @Autowired
    private JugadorRepository jugadorRepository;


    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Jugador save(@RequestBody Jugador jugador) {
        return jugadorRepository.save(jugador);
    }

    @RequestMapping(method= RequestMethod.GET)
    public List<Jugador> findAll() {
        List<Jugador> jugadores = new ArrayList<Jugador>();
        Iterator<Jugador> iterator = jugadorRepository.findAll().iterator();

        while (iterator.hasNext()) {
            jugadores.add(iterator.next());
        }

        return jugadores;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable Long id) {
        Jugador jugadores = jugadorRepository.findOne(id);

        if(jugadores == null);

        jugadorRepository.delete(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Jugador updateById(@PathVariable Long id, @RequestBody Jugador jugador) {
        Jugador d1 = jugadorRepository.findOne(id);

        if(d1 == null);

        return jugadorRepository.save(jugador);
    }
}
