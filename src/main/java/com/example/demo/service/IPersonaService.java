package com.example.demo.service;

import com.example.demo.model.Persona;

public interface IPersonaService {
    
  //  public void crearPersona (Persona persona);
    
  //  public void borrarPersona (Long id);
    
    public Persona buscarPersona (Long id);
    
    public Persona editarPersona (Persona persona);
}
