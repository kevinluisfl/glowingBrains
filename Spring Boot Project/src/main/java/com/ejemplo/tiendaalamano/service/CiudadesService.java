package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.tiendaalamano.model.Ciudades;
import com.ejemplo.tiendaalamano.repository.CiudadesRepository;


@Service
public class CiudadesService {
	@Autowired
	CiudadesRepository ciudadesRepository;


	public List<Ciudades> obtenerPedidos() {
		return ciudadesRepository.findAll();
	}
	
	public Optional<Ciudades> obtenerPedidosId(Long id) {
		return ciudadesRepository.findById(id);
	}
	
	public Ciudades guardarPedido(Ciudades ciudad) {
		return ciudadesRepository.save(ciudad);
	}
	
	public Ciudades actualizarCiudad(Ciudades ciudad) {
		return ciudadesRepository.save(ciudad);
	}
	
	public boolean eleminarPedido(Long id) {
		if (ciudadesRepository.existsById(id)) {
			ciudadesRepository.deleteById(id);
			return true;
		}else {
			return false;
		}
		
	}
}