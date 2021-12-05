package com.ejemplo.tiendaalamano.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ejemplo.tiendaalamano.model.Domiciliarios;
import com.ejemplo.tiendaalamano.repository.DomiciliariosRepository;


@Service
public class DomiciliariosService {
	@Autowired
	DomiciliariosRepository domiciliariosRepository;


	public List<Domiciliarios> obtenerPedidos() {
		return domiciliariosRepository.findAll();
	}
	
	public Domiciliarios guardarPedido(Domiciliarios domiciliario) {
		return domiciliariosRepository.save(domiciliario);
	}
	
	public boolean eleminarPedido(Long id) {
		if (domiciliariosRepository.existsById(id)) {
			domiciliariosRepository.deleteById(id);
			return true;
		}else {
			return false;
		}
		
	}
}