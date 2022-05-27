
package com.example.demo.service;

import com.example.demo.model.Titulos;
import java.util.List;


public interface ITituloService{
    
    public List<Titulos> verFormacion();
    
    public void crearTitulo (Titulos titulo);
    
    public void borrarTitulo (Long id);
    
    public Titulos buscarTitulo (Long id);
    
    public Titulos editarTitulo (Titulos titulo);
    
    
}
