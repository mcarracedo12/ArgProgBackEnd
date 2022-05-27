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
public class Experiencias {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String empresa;
    private String inicio;
    private String fin;
    private String puesto;
    private String link;
    private String img;

    public Experiencias() {
    }

    public Experiencias(Long id, String empresa, String inicio, String fin, String puesto, String link, String img) {
        this.id = id;
        this.empresa = empresa;
        this.inicio = inicio;
        this.fin = fin;
        this.puesto = puesto;
        this.link = link;
        this.img = img;
    }

}
