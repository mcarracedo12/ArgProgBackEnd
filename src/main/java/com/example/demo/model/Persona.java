package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Mari
 */
@Getter
@Setter
@Entity

public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombre;
    private String tituloactual;
    private String empresa;
    private String puesto;
    private String contacto;
    private String contrasenia;
    private String ciudad;
    private String provincia;
    private String pais;
    private String img;
    private String sobremi;
   // private Titulos[] formacion;
   // private Experiencias[] experiencias;
   // private Habilidades[] habilidades;
   // private Proyectos[] proyectos;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String tituloactual, String empresa, String puesto, String contacto, String contrasenia, String ciudad, String provincia, String pais, String img, String sobremi) {
        this.id = id;
        this.nombre = nombre;
        this.tituloactual = tituloactual;
        this.empresa = empresa;
        this.puesto = puesto;
        this.contacto = contacto;
        this.contrasenia = contrasenia;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.pais = pais;
        this.img = img;
        this.sobremi = sobremi;

    }

}
