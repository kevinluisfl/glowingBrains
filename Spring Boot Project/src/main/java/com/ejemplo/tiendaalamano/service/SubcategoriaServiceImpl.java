package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ejemplo.tiendaalamano.model.Subcategorias;
import com.ejemplo.tiendaalamano.repository.SubcategoriaRepository;

@Service
public class SubcategoriaServiceImpl implements SubcategoriaService {
	@Autowired
	private SubcategoriaRepository subcategoriaRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Subcategorias> findAll() {
		return subcategoriaRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Subcategorias> findById(Long id) {
		return subcategoriaRepository.findById(id);
	}

	@Override
	@Transactional
	public Subcategorias save(Subcategorias subcategoria) {
		return subcategoriaRepository.save(subcategoria);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		subcategoriaRepository.deleteById(id);
	}


}
