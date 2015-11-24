package com.example.Model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by jhipster on 4/11/15.
 */
@Entity
public class Temporada {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    protected Long id;

    @Column
    protected String name;

    @ManyToOne
    private Liga liga;

    @ManyToMany
    public Set<Equipo> equipos = new HashSet<>();

//getters and setters
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

    public Liga getLiga() {
        return liga;
    }

    public void setLiga(Liga liga) {
        this.liga = liga;
    }

    public Set<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(Set<Equipo> equipos) {
        this.equipos = equipos;
    }

    //constructor
    public Temporada(String name) {
        this.name = name;
    }

    public Temporada() {
    }

    @Override
    public String toString() {
        return "Temporada{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
