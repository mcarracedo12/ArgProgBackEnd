
package com.example.demo.service;

import com.example.demo.model.Persona;
import com.example.demo.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {
    
    @Autowired
    public PersonaRepository personaRepo;

    @Override
    public Persona buscarPersona(Long id) {
         Persona persona= personaRepo.findById(id).orElse(null);
         return persona;
    }

    @Override
    public Persona editarPersona(Persona persona) {
        return personaRepo.save(persona);
    }
    
}
