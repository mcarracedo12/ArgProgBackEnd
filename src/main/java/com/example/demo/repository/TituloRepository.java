package com.example.demo.repository;

import com.example.demo.model.Titulos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Mari
 */
@Repository
public interface TituloRepository extends JpaRepository<Titulos, Long>{
    
}
