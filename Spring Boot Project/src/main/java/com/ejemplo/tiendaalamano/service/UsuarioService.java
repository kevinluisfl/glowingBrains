package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import com.ejemplo.tiendaalamano.model.Usuarios;

public interface UsuarioService {
	public List<Usuarios> findAll();
	public Optional<Usuarios> findById(Long id);
	public List<Usuarios> login(String username, String password);
	public Usuarios save(Usuarios Usuario);
	public void deleteById(Long id);
	
}
