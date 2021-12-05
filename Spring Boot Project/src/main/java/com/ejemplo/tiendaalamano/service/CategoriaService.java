package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import com.ejemplo.tiendaalamano.model.Categorias;

public interface CategoriaService {
	public List<Categorias> findAll();
	public Optional<Categorias> findById(Long id);
	public Categorias save(Categorias categoria);
	public void deleteById(Long id);
	
}
