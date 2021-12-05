package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import com.ejemplo.tiendaalamano.model.Productos;

public interface ProductoService {
	public List<Productos> findAll();
	public Optional<Productos> findById(Long id);
	public Productos save(Productos producto);
	public void deleteById(Long id);
	
}
