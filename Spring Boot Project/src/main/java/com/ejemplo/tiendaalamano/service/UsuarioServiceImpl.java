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
	private UsuarioRepository usuarioRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Usuarios> findAll() {
		return usuarioRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Usuarios> findById(Long id) {
		return usuarioRepository.findById(id);
	}

	@Override
	@Transactional
	public Usuarios save(Usuarios Usuario) {
		return usuarioRepository.save(Usuario);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		usuarioRepository.deleteById(id);
	}

//	@Override
//	public List<Usuarios> login(String username, String password) {
//		List<Usuarios> Usuarios = usuarioRepository.login(username, password);
//		return Usuarios;
//	}

}
