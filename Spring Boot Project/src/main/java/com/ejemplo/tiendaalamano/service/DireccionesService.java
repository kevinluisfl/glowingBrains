package com.ejemplo.tiendaalamano.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ejemplo.tiendaalamano.model.Direcciones;
import com.ejemplo.tiendaalamano.repository.DireccionesRepository;


@Service
public class DireccionesService {
	@Autowired
	DireccionesRepository direccionesRepository;


	public List<Direcciones> obtenerPedidos() {
		return direccionesRepository.findAll();
	}
	
	public Direcciones guardarPedido(Direcciones direccion) {
		return direccionesRepository.save(direccion);
	}
	
	public boolean eleminarPedido(Long id) {
		if (direccionesRepository.existsById(id)) {
			direccionesRepository.deleteById(id);
			return true;
		}else {
			return false;
		}
		
	}
}