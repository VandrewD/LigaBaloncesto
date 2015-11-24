package com.example.Service;

import com.example.Model.Equipo;
import com.example.Model.Jugador;
import com.example.Repository.EquipoRepository;
import com.example.Repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by jhipster on 21/10/15.
 */
@Service
@Transactional
public class EquipoService {
@Autowired
    private EquipoRepository equipoRepository;
    @Autowired
    private JugadorRepository jugadorRepository;

    public void testEquipo() {
        Equipo equipo = new Equipo();
        equipo.setName("Leones B.C");
        equipo.setLocalidad("L.A");
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.set(1892, Calendar.FEBRUARY, 18);
        equipo.setFechaCreacion(calendar.getTime());
        equipoRepository.save(equipo);

        Equipo equipo2 = new Equipo();
        equipo2.setName("Fox");
        equipo2.setLocalidad("Bcn");
        calendar = GregorianCalendar.getInstance();
        calendar.set(1952, Calendar.FEBRUARY, 22);
        equipo2.setFechaCreacion(calendar.getTime());
        equipoRepository.save(equipo2);

        Equipo equipo3 = new Equipo();
        equipo3.setName("Floretes");
        equipo3.setLocalidad("Sabadell");
        calendar = GregorianCalendar.getInstance();
        calendar.set(1957, Calendar.AUGUST, 15);
        equipo3.setFechaCreacion(calendar.getTime());
        equipoRepository.save(equipo3);

        Equipo equipo4 = new Equipo();
        equipo4.setName("Patrols");
        equipo4.setLocalidad("Sant Boi");
        calendar = GregorianCalendar.getInstance();
        calendar.set(1975, Calendar.OCTOBER, 15);
        equipo4.setFechaCreacion(calendar.getTime());
        equipoRepository.save(equipo4);

        Equipo equipo5 = new Equipo();
        equipo5.setName("Matadepera B.C");
        equipo5.setLocalidad("Matadepera");
        calendar = GregorianCalendar.getInstance();
        calendar.set(1960, Calendar.JANUARY, 15);
        equipo5.setFechaCreacion(calendar.getTime());
        equipoRepository.save(equipo5);


        

    }
}
