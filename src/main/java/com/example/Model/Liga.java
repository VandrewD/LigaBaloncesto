package com.example.Model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by jhipster on 4/11/15.
 */
@Entity
public class Liga {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    protected Long id;

    @Column
    protected String name;

    @OneToMany(mappedBy = "liga")
    private Set<Temporada> temporadas = new HashSet<>();

//getters setters
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

    public Set<Temporada> getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(Set<Temporada> temporadas) {
        this.temporadas = temporadas;
    }

    //constructor ple
    public Liga(String name) {
        this.name = name;
    }
    //constructor buit
    public Liga() {
    }

//toString

    @Override
    public String toString() {
        return "Liga{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
