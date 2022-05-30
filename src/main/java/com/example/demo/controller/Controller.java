/*
 * ACA VAN TODAS LAS RUTAS
 */
package com.example.demo.controller;

import com.example.demo.model.Experiencias;
import com.example.demo.model.Habilidades;
import com.example.demo.model.Persona;
import com.example.demo.model.Proyectos;
import com.example.demo.model.Titulos;
import com.example.demo.service.IExperienciaService;
import com.example.demo.service.IHabilidadService;
import com.example.demo.service.IPersonaService;
import com.example.demo.service.IProyectoService;
import com.example.demo.service.ITituloService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    /////PERSONA////
    @Autowired
    private IPersonaService personaServ;

    @GetMapping("{id}")
    @ResponseBody
    public Persona mostrarPersona(@PathVariable Long id) {
        return personaServ.buscarPersona(id);
    }

    @PutMapping("{id}")
    public Persona modificarPersona(@PathVariable Long id,
            @RequestParam("nombre") String newNombre,
            @RequestParam("tituloactual") String newTituloactual,
            @RequestParam("empresa") String newEmpresa,
            @RequestParam("puesto") String newPuesto,
            @RequestParam("contacto") String newContacto,
            @RequestParam("ciudad") String newCiudad,
            @RequestParam("provincia") String newProvincia,
            @RequestParam("pais") String newPais,
            @RequestParam("img") String newImg
            //     @RequestParam("sobremi") String newSobremi
            ) {
        Persona persona = personaServ.buscarPersona(id);
        persona.setNombre(newNombre);
        persona.setTituloactual(newTituloactual);
        persona.setEmpresa(newEmpresa);
        persona.setPuesto(newPuesto);
        persona.setContacto(newContacto);
        persona.setCiudad(newCiudad);
        persona.setProvincia(newProvincia);
        persona.setPais(newPais);
        persona.setImg(newImg);
        //  persona.setSobremi(newSobremi);

        personaServ.editarPersona(persona);
        return persona;
    }

    @PutMapping("{id}/sobremi")
    public Persona modificarAbout(@PathVariable Long id,
            @RequestParam("sobremi") String newSobremi
    ) {
        Persona persona = personaServ.buscarPersona(id);
        persona.setSobremi(newSobremi);
        personaServ.editarPersona(persona);
        return persona;
    }

    /////FORMACION////
    List<Titulos> listaTitulos = new ArrayList();

    @Autowired
    private ITituloService tituloServ;

    @GetMapping("formacion")
    @ResponseBody
    public List<Titulos> verTitulos() {
        return tituloServ.verFormacion();
    }

    @PostMapping("titulo")
    public Titulos agregarTitulo(
            @RequestBody Titulos titulo) {
        tituloServ.crearTitulo(titulo);
        return titulo;
    }

    @DeleteMapping("titulo/{id}")
    public void borrarTitulo(
            @PathVariable Long id) {
        tituloServ.borrarTitulo(id);
    }

    @GetMapping("titulo/{id}")
    public void mostrarTitulo(
            @PathVariable Long id) {
        tituloServ.buscarTitulo(id);
    }

    @PutMapping("titulo/{id}")
    public Titulos modificarTitulo(
            @PathVariable Long id,
            @RequestParam("institucion") String newInstitucion,
            @RequestParam("inicio") String newInicio,
            @RequestParam("fin") String newFin,
            @RequestParam("carrera") String newCarrera,
            @RequestParam("link") String newLink,
            @RequestParam("img") String newImg
    ) {
        Titulos titulo = tituloServ.buscarTitulo(id);
        titulo.setInstitucion(newInstitucion);
        titulo.setInicio(newInicio);
        titulo.setFin(newFin);
        titulo.setCarrera(newCarrera);
        titulo.setLink(newLink);
        titulo.setImg(newImg);

        tituloServ.editarTitulo(titulo);
        return titulo;
    }

    /////EXPERIENCIA////
    List<Experiencias> listaExperiencias = new ArrayList();

    @Autowired
    private IExperienciaService expServ;

    @GetMapping("experiencias")
    @ResponseBody
    public List<Experiencias> verExperiencias() {
        return expServ.verExperiencias();
    }

    @PostMapping("experiencia")
    public Experiencias agregarExperiencia(
            @RequestBody Experiencias experiencia) {
        expServ.crearExperiencia(experiencia);
        return experiencia;
    }

    @DeleteMapping("experiencia/{id}")
    public void borrarExperiencia(
            @PathVariable Long id) {
        expServ.borrarExperiencia(id);
    }

    @GetMapping("experiencia/{id}")
    public void mostrarExperiencia(
            @PathVariable Long id) {
        expServ.buscarExperiencia(id);
    }

    @PutMapping("experiencia/{id}")
    public Experiencias modificarExperiencia(
            @PathVariable Long id,
            @RequestParam("empresa") String newEmpresa,
            @RequestParam("inicio") String newInicio,
            @RequestParam("fin") String newFin,
            @RequestParam("puesto") String newPuesto,
            @RequestParam("link") String newLink,
            @RequestParam("img") String newImg
    ) {
        Experiencias experiencia = expServ.buscarExperiencia(id);
        experiencia.setEmpresa(newEmpresa);
        experiencia.setInicio(newInicio);
        experiencia.setFin(newFin);
        experiencia.setPuesto(newPuesto);
        experiencia.setLink(newLink);
        experiencia.setImg(newImg);

        expServ.editarExperiencia(experiencia);
        return experiencia;
    }

    /////HABILIDADES////
    List<Habilidades> listaHabilidades = new ArrayList();

    @Autowired
    private IHabilidadService habilServ;

    @GetMapping("habilidades")
    @ResponseBody
    public List<Habilidades> verHabilidades() {
        return habilServ.verHabilidades();
    }

    @PostMapping("habilidad")
    public Habilidades agregarHabilidad(
            @RequestBody Habilidades habilidad) {
        habilServ.crearHabilidad(habilidad);
        return habilidad;
    }

    @DeleteMapping("habilidad/{id}")
    public void borrarHabilidad(
            @PathVariable Long id) {
        habilServ.borrarHabilidad(id);
    }

    @GetMapping("habilidad/{id}")
    public void mostrarHabilidad(
            @PathVariable Long id) {
        habilServ.buscarHabilidad(id);
    }

    @PutMapping("habilidad/{id}")
    public Habilidades modificarHabilidad(
            @PathVariable Long id,
            @RequestParam("nombre") String newNombre,
            @RequestParam("porcentaje") Long newPorcentaje
    ) {
        Habilidades habilidad = habilServ.buscarHabilidad(id);
        habilidad.setNombre(newNombre);
        habilidad.setPorcentaje(newPorcentaje);

        habilServ.editarHabilidad(habilidad);
        return habilidad;
    }

    /////PROYECTOS////
    List<Proyectos> listaProyectos = new ArrayList();

    @Autowired
    private IProyectoService proyServ;

    @GetMapping("proyectos")
    @ResponseBody
    public List<Proyectos> verProyectos() {
        return proyServ.verProyectos();
    }

    @PostMapping("proyecto")
    public Proyectos agregarProyecto(@RequestBody Proyectos proyecto
    ) {
        proyServ.crearProyecto(proyecto);
        return proyecto;
    }

    @DeleteMapping("proyecto/{id}")
    public void borrarProyecto(
            @PathVariable Long id) {
        proyServ.borrarProyecto(id);
    }

    @GetMapping("proyecto/{id}")
    public void mostrarProyecto(
            @PathVariable Long id) {
        proyServ.buscarProyecto(id);
    }

    @PutMapping("proyecto/{id}")
    public Proyectos modificarProyecto(
            @PathVariable Long id,
            @RequestParam("nombre") String newNombre,
            @RequestParam("descripcion") String newDescripcion,
            @RequestParam("anio") String newAnio,
            @RequestParam("link") String newLink
    ) {
        Proyectos proyecto = proyServ.buscarProyecto(id);
        proyecto.setNombre(newNombre);
        proyecto.setDescripcion(newDescripcion);
        proyecto.setAnio(newAnio);
        proyecto.setLink(newLink);

        proyServ.editarProyecto(proyecto);
        return proyecto;
    }

}
