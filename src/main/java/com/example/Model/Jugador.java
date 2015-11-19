package com.example.Model;

import javax.persistence.*;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by jhipster on 8/10/15.
 */
@Entity
public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    protected Long id;

    @Column
    protected String name;

    @Column
    protected Date fechaNacimiento;

    @Column
    protected Integer canastasTotales;

    @Column
    protected Integer asistenciasTotales;

    @Column
    protected Integer rebotesTotales;

    @Column
    protected String posicion;

    @ManyToOne
    private Equipo equipo;

    public Jugador() {
    }

    public Jugador(String name, Date fecha_nacimiento, Integer canastas_totales, Integer asistencias_totales, Integer rebotes_totales, String posicion) {
        this.name = name;
        this.fechaNacimiento = fecha_nacimiento;
        this.canastasTotales = canastas_totales;
        this.asistenciasTotales = asistencias_totales;
        this.rebotesTotales = rebotes_totales;
        this.posicion = posicion;
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

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getCanastasTotales() {
        return canastasTotales;
    }

    public void setCanastasTotales(Integer canastasTotales) {
        this.canastasTotales = canastasTotales;
    }

    public Integer getAsistenciasTotales() {
        return asistenciasTotales;
    }

    public void setAsistenciasTotales(Integer asistenciasTotales) {
        this.asistenciasTotales = asistenciasTotales;
    }

    public Integer getRebotesTotales() {
        return rebotesTotales;
    }

    public void setRebotesTotales(Integer rebotesTotales) {
        this.rebotesTotales = rebotesTotales;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fecha_nacimiento=" + fechaNacimiento +
                ", canastas_totales=" + canastasTotales +
                ", asistencias_totales=" + asistenciasTotales +
                ", rebotes_totales=" + rebotesTotales +
                ", posicion='" + posicion + '\'' +
                '}';
    }
}
