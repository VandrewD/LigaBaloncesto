package com.example.Service;

import com.example.Model.Jugador;
import com.example.Repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by jhipster on 8/10/15.
 */
@Service
@Transactional
public class JugadorService {

    @Autowired

    private JugadorRepository jugadorRepository;

    public void testJugador(){

        Jugador jugador = new Jugador();
        jugador.setName("Luis");

        Calendar calendar = GregorianCalendar.getInstance();
        calendar.set(1892, Calendar.FEBRUARY, 18);
        jugador.setFecha_nacimiento(calendar.getTime());

        jugador.setCanastas_totales(15);
        jugador.setAsistencias_totales(25);
        jugador.setRebotes_totales(10);
        jugador.setPosicion("Pibot");
        jugadorRepository.save(jugador);

        Jugador jugador2 = new Jugador();
        jugador2.setName("Andreu");
        calendar = GregorianCalendar.getInstance();
        calendar.set(1992, Calendar.FEBRUARY, 17);
        jugador2.setFecha_nacimiento(calendar.getTime());
        jugador2.setCanastas_totales(30);
        jugador2.setAsistencias_totales(40);
        jugador2.setRebotes_totales(50);
        jugador2.setPosicion("Base");
        jugadorRepository.save(jugador2);

        Jugador jugador3 = new Jugador();
        jugador3.setName("Victor");
        calendar = GregorianCalendar.getInstance();
        calendar.set(1998, Calendar.NOVEMBER, 22);
        jugador3.setFecha_nacimiento(calendar.getTime());
        jugador3.setCanastas_totales(75);
        jugador3.setAsistencias_totales(45);
        jugador3.setRebotes_totales(50);
        jugador3.setPosicion("Pibot");
        jugadorRepository.save(jugador3);

        Jugador jugador4 = new Jugador();
        jugador4.setName("Uri");
        calendar = GregorianCalendar.getInstance();
        calendar.set(1895, Calendar.DECEMBER, 17);
        jugador4.setFecha_nacimiento(calendar.getTime());
        jugador4.setCanastas_totales(85);
        jugador4.setAsistencias_totales(55);
        jugador4.setRebotes_totales(45);
        jugador4.setPosicion("Ale");
        jugadorRepository.save(jugador4);

        Jugador jugador5 = new Jugador();
        jugador5.setName("Ferran");
        calendar = GregorianCalendar.getInstance();
        calendar.set(1958, Calendar.AUGUST, 28);
        jugador5.setFecha_nacimiento(calendar.getTime());
        jugador5.setCanastas_totales(2);
        jugador5.setAsistencias_totales(4);
        jugador5.setRebotes_totales(3);
        jugador5.setPosicion("Base");
        jugadorRepository.save(jugador5);

        //a
        System.out.println(jugadorRepository.findByNameContaining("And"));
        //b
        System.out.println(jugadorRepository.findBycanastasTotalesGreaterThanEqual(75));
        //c
        System.out.println(jugadorRepository.findByAsistenciasTotalesBetween(30, 55));
        //d
        System.out.println(jugadorRepository.findByposicionEquals("Ale"));
        //e
        calendar = GregorianCalendar.getInstance();
        calendar.set(1992, Calendar.FEBRUARY, 17);
        System.out.println(jugadorRepository.findByfechaNacimientoLessThan(calendar.getTime()));
        //f
        System.out.println(jugadorRepository.findByCanastasTotalesGreaterThanEqualAndFechaNacimientoBefore(5, calendar.getTime()));
    }
}
