package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ejemplo.tiendaalamano.model.Usuarios;

import com.ejemplo.tiendaalamano.repository.UsuariosRepository;

@Service
public class UsuariosServiceImpl implements UsuariosService {
	@Autowired
	private UsuariosRepository usuarioRepository;


	@Transactional(readOnly = true)
	public List<Usuarios> findAll() {
		return usuarioRepository.findAll();
	}

	
	@Transactional(readOnly = true)
	public Optional<Usuarios> findById(Long id) {
		return usuarioRepository.findById(id);
	}

	
	@Transactional
	public Usuarios save(Usuarios Usuario) {
		return usuarioRepository.save(Usuario);
	}

	
	@Transactional
	public void deleteById(Long id) {
		usuarioRepository.deleteById(id);
	}



}
