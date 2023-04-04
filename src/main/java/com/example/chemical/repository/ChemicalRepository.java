package com.example.chemical.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.chemical.model.Chemical;

public interface ChemicalRepository extends CrudRepository<Chemical, Integer> {
    
}
