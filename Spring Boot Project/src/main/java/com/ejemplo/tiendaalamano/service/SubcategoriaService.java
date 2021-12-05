package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import com.ejemplo.tiendaalamano.model.Subcategorias;

public interface SubcategoriaService {
	public List<Subcategorias> findAll();
	public Optional<Subcategorias> findById(Long id);
	public Subcategorias save(Subcategorias subcategoria);
	public void deleteById(Long id);
	
}
