/*
 */
package com.example.demo.repository;

import com.example.demo.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Mari
 */
@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long>{
    
}
