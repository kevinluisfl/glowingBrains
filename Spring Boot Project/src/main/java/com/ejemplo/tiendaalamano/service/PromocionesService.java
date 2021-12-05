package com.ejemplo.tiendaalamano.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ejemplo.tiendaalamano.model.Promociones;
import com.ejemplo.tiendaalamano.repository.PromocionesRepository;


@Service
public class PromocionesService {
	@Autowired
	PromocionesRepository promocionesRepository;


	public List<Promociones> obtenerPedidos() {
		return promocionesRepository.findAll();
	}
	
	public Promociones guardarPedido(Promociones promocion) {
		return promocionesRepository.save(promocion);
	}
	
	public boolean eleminarPedido(Long id) {
		if (promocionesRepository.existsById(id)) {
			promocionesRepository.deleteById(id);
			return true;
		}else {
			return false;
		}
		
	}
}