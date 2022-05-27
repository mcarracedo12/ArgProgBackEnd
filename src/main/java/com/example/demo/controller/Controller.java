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

    @GetMapping("/{id}")
    @ResponseBody
    public Persona mostrarPersona(@PathVariable Long id) {
        return personaServ.buscarPersona(id);
    }

    @PutMapping("/{id}")
    public Persona modificarPersona(@PathVariable Long id,
            @RequestParam("nombre") String newNombre,
            @RequestParam("tituloactual") String newTituloactual,
            @RequestParam("empresa") String newEmpresa,
            @RequestParam("puesto") String newPuesto,
            @RequestParam("contacto") String newContacto,
            @RequestParam("ciudad") String newCiudad,
            @RequestParam("provincia") String newProvincia,
            @RequestParam("pais") String newPais,
            @RequestParam("img") String newImg,
            @RequestParam("sobremi") String newSobremi
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
        persona.setSobremi(newSobremi);

        personaServ.editarPersona(persona);
        return persona;
    }
    

    /////FORMACION////
    List<Titulos> listaTitulos = new ArrayList();

    @Autowired
    private ITituloService tituloServ;

    @GetMapping("/{persona_id}/formacion")
    @ResponseBody
    public List<Titulos> verTitulos(@PathVariable Long persona_id) {
        return tituloServ.verFormacion();
    }

    @PostMapping("/{persona_id}/titulo")
    public Titulos agregarTitulo(@PathVariable Long persona_id,
            @RequestBody Titulos titulo) {
        tituloServ.crearTitulo(titulo);
        return titulo;
    }

    @DeleteMapping("/{persona_id}/titulo/{id}")
    public void borrarTitulo(@PathVariable Long persona_id,
            @PathVariable Long id) {
        tituloServ.borrarTitulo(id);
    }

    @GetMapping("/{persona_id}/titulo/{id}")
    public void mostrarTitulo(@PathVariable Long persona_id,
            @PathVariable Long id) {
        tituloServ.buscarTitulo(id);
    }

    @PutMapping("/{persona_id}/titulo/{id}")
    public Titulos modificarTitulo(@PathVariable Long persona_id,
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

    @GetMapping("/{persona_id}/experiencias")
    @ResponseBody
    public List<Experiencias> verExperiencias(@PathVariable Long persona_id) {
        return expServ.verExperiencias();
    }

    @PostMapping("/{persona_id}/experiencia")
    public Experiencias agregarExperiencia(@PathVariable Long persona_id,
            @RequestBody Experiencias experiencia) {
        expServ.crearExperiencia(experiencia);
        return experiencia;
    }

    @DeleteMapping("/{persona_id}/experiencia/{id}")
    public void borrarExperiencia(@PathVariable Long persona_id,
            @PathVariable Long id) {
        expServ.borrarExperiencia(id);
    }

    @GetMapping("/{persona_id}/experiencia/{id}")
    public void mostrarExperiencia(@PathVariable Long persona_id,
            @PathVariable Long id) {
        expServ.buscarExperiencia(id);
    }

    @PutMapping("/{persona_id}/experiencia/{id}")
    public Experiencias modificarExperiencia(@PathVariable Long persona_id,
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

    @GetMapping("/{persona_id}/habilidades")
    @ResponseBody
    public List<Habilidades> verHabilidades(@PathVariable Long persona_id) {
        return habilServ.verHabilidades();
    }

    @PostMapping("/{persona_id}/habilidad")
    public Habilidades agregarHabilidad(@PathVariable Long persona_id,
            @RequestBody Habilidades habilidad) {
        habilServ.crearHabilidad(habilidad);
        return habilidad;
    }

    @DeleteMapping("/{persona_id}/habilidad/{id}")
    public void borrarHabilidad(@PathVariable Long persona_id,
            @PathVariable Long id) {
        habilServ.borrarHabilidad(id);
    }

    @GetMapping("/{persona_id}/habilidad/{id}")
    public void mostrarHabilidad(@PathVariable Long persona_id,
            @PathVariable Long id) {
        habilServ.buscarHabilidad(id);
    }

    @PutMapping("/{persona_id}/habilidad/{id}")
    public Habilidades modificarHabilidad(@PathVariable Long persona_id,
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

    @GetMapping("/{persona_id}/proyectos")
    @ResponseBody
    public List<Proyectos> verProyectos(@PathVariable Long persona_id) {
        return proyServ.verProyectos();
    }

    @PostMapping("/{persona_id}/proyecto")
    public Proyectos agregarProyecto(@RequestBody Proyectos proyecto,
            @PathVariable Long persona_id) {
        proyServ.crearProyecto(proyecto);
        return proyecto;
    }

    @DeleteMapping("/{persona_id}/proyecto/{id}")
    public void borrarProyecto(
            @PathVariable Long persona_id,
            @PathVariable Long id) {
        proyServ.borrarProyecto(id);
    }

    @GetMapping("/{persona_id}/proyecto/{id}")
    public void mostrarProyecto(
            @PathVariable Long persona_id,
            @PathVariable Long id) {
        proyServ.buscarProyecto(id);
    }

    @PutMapping("/{persona_id}/proyecto/{id}")
    public Proyectos modificarProyecto(
            @PathVariable Long persona_id,
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
