package com.example.Model;

import javax.persistence.*;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by jhipster on 21/10/15.
 */

@Entity
public class Equipo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    protected Long id;

    @Column
    protected String name;

    @Column
    protected String localidad;

    @Column
    protected Date fechaCreacion;

    @OneToMany(mappedBy = "equipo")
    private Set <Jugador> jugadors = new HashSet<>();

    @ManyToMany(mappedBy = "equipos")
    private Set <Temporada> temporadas = new HashSet<>();


    public Equipo(){
    }

    public Equipo(String name, String localidad, Date fechaCreacion) {
        this.name = name;
        this.localidad = localidad;
        this.fechaCreacion = fechaCreacion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Set<Jugador> getJugadors() {
        return jugadors;
    }

    public void setJugadors(Set<Jugador> jugadors) {
        this.jugadors = jugadors;
    }

    public Set<Temporada> getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(Set<Temporada> temporadas) {
        this.temporadas = temporadas;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", localidad='" + localidad + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                '}';
    }
}
