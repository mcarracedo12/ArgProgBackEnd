package com.example.demo.service;

import com.example.demo.model.Habilidades;
import java.util.List;

/**
 *
 * @author Mari
 */
public interface IHabilidadService {

    public List<Habilidades> verHabilidades();

    public void crearHabilidad(Habilidades habilidad);

    public void borrarHabilidad(Long id);

    public Habilidades buscarHabilidad(Long id);

    public Habilidades editarHabilidad(Habilidades habilidad);

}
