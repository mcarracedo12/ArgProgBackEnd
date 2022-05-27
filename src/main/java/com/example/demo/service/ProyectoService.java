package com.example.demo.service;

import com.example.demo.model.Proyectos;
import com.example.demo.repository.ProyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Mari
 */
@Service
public class ProyectoService implements IProyectoService {

    @Autowired
    public ProyectosRepository proyRepo;

    @Override
    public List<Proyectos> verProyectos() {
        List<Proyectos> proyectos = proyRepo.findAll();
        return proyectos;
    }

    @Override
    public void crearProyecto(Proyectos proyecto) {
        proyRepo.save(proyecto);
    }

    @Override
    public void borrarProyecto(Long id) {
        proyRepo.deleteById(id);
    }

    @Override
    public Proyectos buscarProyecto(Long id) {
        Proyectos proyecto = proyRepo.findById(id).orElse(null);
        return proyecto;
    }

    @Override
    public Proyectos editarProyecto(Proyectos proyecto) {
        return proyRepo.save(proyecto);
    }

}
