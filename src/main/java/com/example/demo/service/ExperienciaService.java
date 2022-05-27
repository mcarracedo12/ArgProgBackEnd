package com.example.demo.service;

import com.example.demo.model.Experiencias;
import com.example.demo.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Mari
 */
@Service
public class ExperienciaService implements IExperienciaService {

    @Autowired
    public ExperienciaRepository expRepo;

    @Override
    public List<Experiencias> verExperiencias() {
        List<Experiencias> experiencias = expRepo.findAll();
        return experiencias;
    }

    @Override
    public void crearExperiencia(Experiencias experiencia) {
        expRepo.save(experiencia);
    }

    @Override
    public void borrarExperiencia(Long id) {
        expRepo.deleteById(id);
    }

    @Override
    public Experiencias buscarExperiencia(Long id) {
        Experiencias experiencia = expRepo.findById(id).orElse(null);
        return experiencia;
    }

    @Override
    public Experiencias editarExperiencia(Experiencias experiencia) {
        return expRepo.save(experiencia);
    }

}
