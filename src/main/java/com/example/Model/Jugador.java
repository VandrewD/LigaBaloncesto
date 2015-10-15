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

    public Date getFecha_nacimiento() {
        return fechaNacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fechaNacimiento = fecha_nacimiento;
    }

    public Integer getCanastas_totales() {
        return canastasTotales;
    }

    public void setCanastas_totales(Integer canastas_totales) {
        this.canastasTotales = canastas_totales;
    }

    public Integer getAsistencias_totales() {
        return asistenciasTotales;
    }

    public void setAsistencias_totales(Integer asistencias_totales) {
        this.asistenciasTotales = asistencias_totales;
    }

    public Integer getRebotes_totales() {
        return rebotesTotales;
    }

    public void setRebotes_totales(Integer rebotes_totales) {
        this.rebotesTotales = rebotes_totales;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
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
