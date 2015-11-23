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
import java.util.List;

/**
 * Created by jhipster on 8/10/15.
 */
@Service
@Transactional
public class JugadorService {

    @Autowired

    private JugadorRepository jugadorRepository;
    @Autowired

    private EquipoRepository equipoRepository;

    public void testJugador(){

        Jugador jugador = new Jugador();
        jugador.setName("Luis");

        Calendar calendar = GregorianCalendar.getInstance();
        calendar.set(1892, Calendar.FEBRUARY, 18);
        jugador.setFechaNacimiento(calendar.getTime());

        jugador.setCanastasTotales(15);
        jugador.setAsistenciasTotales(25);
        jugador.setRebotesTotales(10);
        jugador.setPosicion("Pibot");
        jugadorRepository.save(jugador);
        //afegim jugador al equip
        Equipo equipo = equipoRepository.findByNameContaining("Leones B.C").get(0);
        jugador.setEquipo(equipo);
        jugadorRepository.save(jugador);

        Jugador jugador2 = new Jugador();
        jugador2.setName("Andreu");
        calendar = GregorianCalendar.getInstance();
        calendar.set(1992, Calendar.FEBRUARY, 17);
        jugador2.setFechaNacimiento(calendar.getTime());
        jugador2.setCanastasTotales(30);
        jugador2.setAsistenciasTotales(40);
        jugador2.setRebotesTotales(50);
        jugador2.setPosicion("Base");
        jugadorRepository.save(jugador2);

        jugador2.setEquipo(equipo);
        jugadorRepository.save(jugador2);

        Jugador jugador3 = new Jugador();
        jugador3.setName("Victor");
        calendar = GregorianCalendar.getInstance();
        calendar.set(1998, Calendar.NOVEMBER, 22);
        jugador3.setFechaNacimiento(calendar.getTime());
        jugador3.setCanastasTotales(75);
        jugador3.setAsistenciasTotales(45);
        jugador3.setRebotesTotales(50);
        jugador3.setPosicion("Pibot");
        jugadorRepository.save(jugador3);

        jugador3.setEquipo(equipo);
        jugadorRepository.save(jugador3);

        Jugador jugador4 = new Jugador();
        jugador4.setName("Uri");
        calendar = GregorianCalendar.getInstance();
        calendar.set(1895, Calendar.DECEMBER, 17);
        jugador4.setFechaNacimiento(calendar.getTime());
        jugador4.setCanastasTotales(400);
        jugador4.setAsistenciasTotales(55);
        jugador4.setRebotesTotales(45);
        jugador4.setPosicion("Ale");
        jugadorRepository.save(jugador4);

        jugador4.setEquipo(equipo);
        jugadorRepository.save(jugador4);

        Jugador jugador5 = new Jugador();
        jugador5.setName("Ferran");
        calendar = GregorianCalendar.getInstance();
        calendar.set(1958, Calendar.AUGUST, 28);
        jugador5.setFechaNacimiento(calendar.getTime());
        jugador5.setCanastasTotales(2);
        jugador5.setAsistenciasTotales(4);
        jugador5.setRebotesTotales(3);
        jugador5.setPosicion("Base");
        jugadorRepository.save(jugador5);

        jugador5.setEquipo(equipo);
        jugadorRepository.save(jugador5);

        Jugador jugador6 = new Jugador();
        jugador6.setName("Balumba");
        calendar = GregorianCalendar.getInstance();
        calendar.set(1994, Calendar.SEPTEMBER, 17);
        jugador6.setFechaNacimiento(calendar.getTime());
        jugador6.setCanastasTotales(1);
        jugador6.setAsistenciasTotales(0);
        jugador6.setRebotesTotales(2);
        jugador6.setPosicion("Base");
        jugadorRepository.save(jugador6);

        Equipo equipo2 = equipoRepository.findByNameContaining("Fox").get(0);
        jugador6.setEquipo(equipo2);
        jugadorRepository.save(jugador6);

        Jugador jugador7 = new Jugador();
        jugador7.setName("Tete");
        calendar = GregorianCalendar.getInstance();
        calendar.set(1997, Calendar.MARCH, 25);
        jugador7.setFechaNacimiento(calendar.getTime());
        jugador7.setCanastasTotales(15);
        jugador7.setAsistenciasTotales(30);
        jugador7.setRebotesTotales(45);
        jugador7.setPosicion("Pibot");
        jugadorRepository.save(jugador7);

       // equipo2 = equipoRepository.findByNameContaining("Fox").get(0);
        jugador7.setEquipo(equipo2);
        jugadorRepository.save(jugador7);

        Jugador jugador8 = new Jugador();
        jugador8.setName("Cristian");
        calendar = GregorianCalendar.getInstance();
        calendar.set(1995, Calendar.AUGUST, 30);
        jugador8.setFechaNacimiento(calendar.getTime());
        jugador8.setCanastasTotales(25);
        jugador8.setAsistenciasTotales(95);
        jugador8.setRebotesTotales(50);
        jugador8.setPosicion("Ale");
        jugadorRepository.save(jugador8);

        //equipo2 = equipoRepository.findByNameContaining("Fox").get(0);
        jugador8.setEquipo(equipo2);
        jugadorRepository.save(jugador8);

        Jugador jugador9 = new Jugador();
        jugador9.setName("Tania");
        calendar = GregorianCalendar.getInstance();
        calendar.set(1994, Calendar.SEPTEMBER, 2);
        jugador9.setFechaNacimiento(calendar.getTime());
        jugador9.setCanastasTotales(20);
        jugador9.setAsistenciasTotales(51);
        jugador9.setRebotesTotales(95);
        jugador9.setPosicion("Pibot");
        jugadorRepository.save(jugador9);

       // equipo2 = equipoRepository.findByNameContaining("Fox").get(0);
        jugador9.setEquipo(equipo2);
        jugadorRepository.save(jugador9);

        Jugador jugador10 = new Jugador();
        jugador10.setName("Xavi");
        calendar = GregorianCalendar.getInstance();
        calendar.set(1993, Calendar.MARCH, 20);
        jugador10.setFechaNacimiento(calendar.getTime());
        jugador10.setCanastasTotales(75);
        jugador10.setAsistenciasTotales(96);
        jugador10.setRebotesTotales(85);
        jugador10.setPosicion("Base");
        jugadorRepository.save(jugador7);

        //equipo2 = equipoRepository.findByNameContaining("Fox").get(0);
        jugador10.setEquipo(equipo2);
        jugadorRepository.save(jugador10);

        Jugador jugador11 = new Jugador();
        jugador11.setName("Oriol");
        calendar = GregorianCalendar.getInstance();
        calendar.set(1994, Calendar.AUGUST, 1);
        jugador11.setFechaNacimiento(calendar.getTime());
        jugador11.setCanastasTotales(25);
        jugador11.setAsistenciasTotales(56);
        jugador11.setRebotesTotales(50);
        jugador11.setPosicion("Pibot");
        jugadorRepository.save(jugador11);

        Equipo equipo3 = equipoRepository.findByNameContaining("Floretes").get(0);
        jugador11.setEquipo(equipo3);
        jugadorRepository.save(jugador11);



        //1.a
        System.out.println(jugadorRepository.findByNameContaining("And"));
        //1.b
        System.out.println(jugadorRepository.findBycanastasTotalesGreaterThanEqual(75));
        //1.c
        System.out.println(jugadorRepository.findByAsistenciasTotalesBetween(30, 55));
        //1.d
        System.out.println(jugadorRepository.findByposicionEquals("Ale"));
        //1.e
        calendar = GregorianCalendar.getInstance();
        calendar.set(1992, Calendar.FEBRUARY, 17);
        System.out.println(jugadorRepository.findByfechaNacimientoLessThan(calendar.getTime()));
        //1.f
        System.out.println(jugadorRepository.findByCanastasTotalesGreaterThanEqualAndFechaNacimientoBefore(5, calendar.getTime()));


//2

        //2.a
        System.out.println("Devuelve todos los equipos indicando localidad");
        System.out.println(equipoRepository.findByLocalidadContaining("Matadepera"));
        //2.b
        System.out.println("Devuelve todos los jugadores indicando el equipo");
        List<Jugador> jugadorList = jugadorRepository.findJugadorEquipo("Fox");
        for(Jugador i : jugadorList){
            System.out.println(i.toString());
        }
        //2.c
       System.out.println("Devuelve todos los jugadores indicando el equipo y la posicion");
        List<Jugador> jugadorList2 = jugadorRepository.findJugadorPosicion("Pibot", "Fox");
        for(Jugador i : jugadorList2){
            System.out.println(i.toString());
        }
        //2.d
        System.out.println("Devuelve el jugador con mas canastas totales");
        System.out.println(jugadorRepository.findByOrderByCanastasTotalesDesc().get(0));
        //2.e
        System.out.println("Devuelve los 5 jugadores con mas asistencias");
        System.out.println(jugadorRepository.findFirst5ByOrderByAsistenciasTotalesDesc());
        //2.f
        System.out.println("Devuelve el jugador que mas canastas a hecho en un equipo");
        System.out.println(jugadorRepository.findJugadorCanastasEquipo("Fox").get(0));


    }
}
