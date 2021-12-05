package com.ejemplo.tiendaalamano.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ejemplo.tiendaalamano.model.Categorias;

@Repository
public interface CategoriaRepository extends JpaRepository<Categorias, Long> {
	
}
