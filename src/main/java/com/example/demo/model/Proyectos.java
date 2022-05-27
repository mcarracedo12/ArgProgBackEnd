package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Proyectos {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombre;
    private String descripcion;
    private String anio;
    private String link;

    public Proyectos() {
    }

    public Proyectos(Long id, String nombre, String descripcion, String anio, String link) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.anio = anio;
        this.link = link;
    }
}
