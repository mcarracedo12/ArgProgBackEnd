package com.example.demo.repository;

import com.example.demo.model.Experiencias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Mari
 */
@Repository
public interface ExperienciaRepository extends JpaRepository<Experiencias, Long> {
}
