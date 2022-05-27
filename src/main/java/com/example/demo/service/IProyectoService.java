
package com.example.demo.service;

import com.example.demo.model.Proyectos;
import java.util.List;

/**
 *
 * @author Mari
 */
public interface IProyectoService {
    
    public List <Proyectos> verProyectos();
    
    public void crearProyecto (Proyectos proyecto);
    
    public void borrarProyecto (Long id);
    
    public Proyectos buscarProyecto (Long id);
    
    public Proyectos editarProyecto (Proyectos proyecto);
    
}
