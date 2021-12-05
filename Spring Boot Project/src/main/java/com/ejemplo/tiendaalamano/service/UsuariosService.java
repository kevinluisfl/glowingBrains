package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import com.ejemplo.tiendaalamano.model.Usuarios;

public interface UsuariosService {
	public List<Usuarios> findAll();
	public Optional<Usuarios> findById(Long id);
	public Usuarios save(Usuarios Usuario);
	public void deleteById(Long id);
	
}