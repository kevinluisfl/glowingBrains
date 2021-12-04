package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ejemplo.tiendaalamano.model.Usuarios;
import com.ejemplo.tiendaalamano.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	@Autowired
	private UsuarioRepository UsuarioRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Usuarios> findAll() {
		return UsuarioRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Usuarios> findById(Long id) {
		return UsuarioRepository.findById(id);
	}

	@Override
	@Transactional
	public Usuarios save(Usuarios Usuario) {
		return UsuarioRepository.save(Usuario);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		UsuarioRepository.deleteById(id);
	}

	@Override
	public List<Usuarios> login(String username, String password) {
		List<Usuarios> Usuarios = UsuarioRepository.login(username, password);
		return Usuarios;
	}

}
