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
//import org.springframework.web.bind.annotation.RequestParam;
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
            @RequestBody Persona newPersona
    ) {
        Persona persona = personaServ.buscarPersona(id);
        persona.setNombre(newPersona.getNombre());
        persona.setTituloactual(newPersona.getTituloactual());
        persona.setEmpresa(newPersona.getEmpresa());
        persona.setPuesto(newPersona.getPuesto());
        persona.setContacto(newPersona.getContacto());
        persona.setCiudad(newPersona.getCiudad());
        persona.setProvincia(newPersona.getProvincia());
        persona.setPais(newPersona.getPais());
        persona.setImg(newPersona.getImg());
        persona.setSobremi(newPersona.getSobremi());

        personaServ.editarPersona(persona);
        return persona;
    }

    // @PutMapping("{id}/sobremi")
    //  public Persona modificarAbout(@PathVariable Long id,
    //          @RequestParam("sobremi") String newSobremi
    // ) {
    //      Persona persona = personaServ.buscarPersona(id);
    //      persona.setSobremi(newSobremi);
    //     personaServ.editarPersona(persona);
    //     return persona;
    //  }
    /////FORMACION////
    List<Titulos> listaTitulos = new ArrayList();

    @Autowired
    private ITituloService tituloServ;

    @GetMapping("titulos")
    @ResponseBody
    public List<Titulos> verTitulos() {
        return tituloServ.verFormacion();
    }

    @PostMapping("titulos")
    public Titulos agregarTitulo(
            @RequestBody Titulos titulo) {
        tituloServ.crearTitulo(titulo);
        return titulo;
    }

    @DeleteMapping("titulos/{id}")
    public void borrarTitulo(
            @PathVariable Long id) {
        tituloServ.borrarTitulo(id);
    }

    @GetMapping("titulos/{id}")
    public void mostrarTitulo(
            @PathVariable Long id) {
        tituloServ.buscarTitulo(id);
    }

    @PutMapping("titulos/{id}")
    public Titulos modificarTitulo(
            @PathVariable Long id,
            @RequestBody Titulos newTitulo
    ) {
        Titulos titulo = tituloServ.buscarTitulo(id);
        titulo.setInstitucion(newTitulo.getInstitucion());
        titulo.setInicio(newTitulo.getInicio());
        titulo.setFin(newTitulo.getFin());
        titulo.setCarrera(newTitulo.getCarrera());
        titulo.setLink(newTitulo.getLink());
        titulo.setImg(newTitulo.getImg());

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

    @PostMapping("experiencias")
    public Experiencias agregarExperiencia(
            @RequestBody Experiencias experiencia) {
        expServ.crearExperiencia(experiencia);
        return experiencia;
    }

    @DeleteMapping("experiencias/{id}")
    public void borrarExperiencia(
            @PathVariable Long id) {
        expServ.borrarExperiencia(id);
    }

    @GetMapping("experiencias/{id}")
    public void mostrarExperiencia(
            @PathVariable Long id) {
        expServ.buscarExperiencia(id);
    }

    @PutMapping("experiencias/{id}")
    public Experiencias modificarExperiencia(
            @PathVariable Long id,
            @RequestBody Experiencias newExperiencia
    ) {
        Experiencias experiencia = expServ.buscarExperiencia(id);
        experiencia.setEmpresa(newExperiencia.getEmpresa());
        experiencia.setInicio(newExperiencia.getInicio());
        experiencia.setFin(newExperiencia.getFin());
        experiencia.setPuesto(newExperiencia.getPuesto());
        experiencia.setLink(newExperiencia.getLink());
        experiencia.setImg(newExperiencia.getImg());

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

    @PostMapping("habilidades")
    public Habilidades agregarHabilidad(
            @RequestBody Habilidades habilidad) {
        habilServ.crearHabilidad(habilidad);
        return habilidad;
    }

    @DeleteMapping("habilidades/{id}")
    public void borrarHabilidad(
            @PathVariable Long id) {
        habilServ.borrarHabilidad(id);
    }

    @GetMapping("habilidades/{id}")
    public void mostrarHabilidad(
            @PathVariable Long id) {
        habilServ.buscarHabilidad(id);
    }

    @PutMapping("habilidades/{id}")
    public Habilidades modificarHabilidad(
            @PathVariable Long id,
            @RequestBody Habilidades newHabilidad) {
        Habilidades habilidad = habilServ.buscarHabilidad(id);
        habilidad.setNombre(newHabilidad.getNombre());
        habilidad.setPorcentaje(newHabilidad.getPorcentaje());

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

    @PostMapping("proyectos")
    public Proyectos agregarProyecto(@RequestBody Proyectos proyecto
    ) {
        proyServ.crearProyecto(proyecto);
        return proyecto;
    }

    @DeleteMapping("proyectos/{id}")
    public void borrarProyecto(
            @PathVariable Long id) {
        proyServ.borrarProyecto(id);
    }

    @GetMapping("proyectos/{id}")
    public void mostrarProyecto(
            @PathVariable Long id) {
        proyServ.buscarProyecto(id);
    }

    @PutMapping("proyectos/{id}")
    public Proyectos modificarProyecto(@PathVariable Long id, @RequestBody Proyectos newProyecto) {
        Proyectos proyecto = proyServ.buscarProyecto(id);

        proyecto.setNombre(newProyecto.getNombre());
        proyecto.setDescripcion(newProyecto.getDescripcion());
        proyecto.setAnio(newProyecto.getAnio());
        proyecto.setLink(newProyecto.getLink());

        proyServ.editarProyecto(proyecto);

        return proyecto;
    }

}
