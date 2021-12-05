package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import com.ejemplo.tiendaalamano.model.Marcas;

public interface MarcaService {
	public List<Marcas> findAll();
	public Optional<Marcas> findById(Long id);
	public Marcas save(Marcas categoria);
	public void deleteById(Long id);
	
}
