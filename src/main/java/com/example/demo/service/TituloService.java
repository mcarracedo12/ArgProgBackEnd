
package com.example.demo.service;

import com.example.demo.model.Titulos;
import com.example.demo.repository.TituloRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TituloService implements ITituloService{

    @Autowired
    public TituloRepository tituloRepo;

    @Override
    public void crearTitulo(Titulos titulo) {
        tituloRepo.save(titulo);
    }

    @Override
    public void borrarTitulo(Long id) {
        tituloRepo.deleteById(id);
    }

    @Override
    public Titulos buscarTitulo(Long id) {
         Titulos titulo= tituloRepo.findById(id).orElse(null);
         return titulo;
    }

    @Override
    public List<Titulos> verFormacion() {
        List<Titulos> formacion= tituloRepo.findAll();
       return formacion;
    }
    
    @Override
    public Titulos editarTitulo(Titulos titulo){
        return tituloRepo.save(titulo);
    }

   
    
}
