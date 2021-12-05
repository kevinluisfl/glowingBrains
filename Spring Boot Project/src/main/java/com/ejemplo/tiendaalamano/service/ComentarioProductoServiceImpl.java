package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ejemplo.tiendaalamano.model.Comentarios_producto;
import com.ejemplo.tiendaalamano.repository.ComentarioProductoRepository;

@Service
public class ComentarioProductoServiceImpl implements ComentarioProductoService {
	@Autowired
	private ComentarioProductoRepository comentarioproductoRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Comentarios_producto> findAll() {
		return comentarioproductoRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Comentarios_producto> findById(Long id) {
		return comentarioproductoRepository.findById(id);
	}

	@Override
	@Transactional
	public Comentarios_producto save(Comentarios_producto comentarioproducto) {
		return comentarioproductoRepository.save(comentarioproducto);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		comentarioproductoRepository.deleteById(id);
	}


}
