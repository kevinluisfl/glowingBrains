package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ejemplo.tiendaalamano.model.Categorias;
import com.ejemplo.tiendaalamano.repository.CategoriaRepository;

@Service
public class CategoriaServiceImpl implements CategoriaService {
	@Autowired
	private CategoriaRepository categoriaRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Categorias> findAll() {
		return categoriaRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Categorias> findById(Long id) {
		return categoriaRepository.findById(id);
	}

	@Override
	@Transactional
	public Categorias save(Categorias categoria) {
		return categoriaRepository.save(categoria);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		categoriaRepository.deleteById(id);
	}


}
