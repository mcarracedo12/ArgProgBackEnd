package com.example.demo.service;

import com.example.demo.model.Habilidades;
import com.example.demo.repository.HabilidadesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Mari
 */
@Service
public class HabilidadService implements IHabilidadService {

    @Autowired
    public HabilidadesRepository habilRepo;

    @Override
    public List<Habilidades> verHabilidades() {
        List<Habilidades> habilidades = habilRepo.findAll();
        return habilidades;
    }

    @Override
    public void crearHabilidad(Habilidades habilidad) {
        habilRepo.save(habilidad);
    }

    @Override
    public void borrarHabilidad(Long id) {
        habilRepo.deleteById(id);
    }

    @Override
    public Habilidades buscarHabilidad(Long id) {
        Habilidades habilidad = habilRepo.findById(id).orElse(null);
        return habilidad;
    }

    @Override
    public Habilidades editarHabilidad(Habilidades habilidad) {
        return habilRepo.save(habilidad);
    }

}
