package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ejemplo.tiendaalamano.model.Marcas;
import com.ejemplo.tiendaalamano.repository.MarcaRepository;

@Service
public class MarcaServiceImpl implements MarcaService {
	@Autowired
	private MarcaRepository marcaRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Marcas> findAll() {
		return marcaRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Marcas> findById(Long id) {
		return marcaRepository.findById(id);
	}

	@Override
	@Transactional
	public Marcas save(Marcas marca) {
		return marcaRepository.save(marca);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		marcaRepository.deleteById(id);
	}


}
