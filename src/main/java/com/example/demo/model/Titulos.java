package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class Titulos {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String institucion;
    private String inicio;
    private String fin;
    private String carrera;
    private String link;
    private String img;

    public Titulos() {}

    public Titulos(Long id, String institucion, String inicio, String fin, String carrera, String link, String img) {
        this.id = id;
        this.institucion = institucion;
        this.inicio = inicio;
        this.fin = fin;
        this.carrera = carrera;
        this.link = link;
        this.img = img;

    }
}
