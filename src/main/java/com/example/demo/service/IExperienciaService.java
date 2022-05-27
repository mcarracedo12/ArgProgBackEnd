
package com.example.demo.service;

import com.example.demo.model.Experiencias;
import java.util.List;

/**
 *
 * @author Mari
 */
public interface IExperienciaService {
    
    public List<Experiencias> verExperiencias();
    
    public void crearExperiencia (Experiencias experiencia);
    
    public void borrarExperiencia (Long id);
    
    public Experiencias buscarExperiencia (Long id);
    
    public Experiencias editarExperiencia (Experiencias experiencia);
    
}
