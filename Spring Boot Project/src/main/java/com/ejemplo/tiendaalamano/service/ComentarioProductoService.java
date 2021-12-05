package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import com.ejemplo.tiendaalamano.model.Comentarios_producto;

public interface ComentarioProductoService {
	public List<Comentarios_producto> findAll();
	public Optional<Comentarios_producto> findById(Long id);
	public Comentarios_producto save(Comentarios_producto comentarioproducto);
	public void deleteById(Long id);
	
}
