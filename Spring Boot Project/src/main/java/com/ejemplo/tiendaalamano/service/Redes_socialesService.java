package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.tiendaalamano.model.Redes_sociales;
import com.ejemplo.tiendaalamano.repository.Redes_socialesRepository;


@Service
public class Redes_socialesService {
	@Autowired
	Redes_socialesRepository redes_socialesRepository;


	public List<Redes_sociales> obtenerPedidos() {
		return redes_socialesRepository.findAll();
	}
	
	public Optional<Redes_sociales> obtenerPedidosId(Long id) {
		return redes_socialesRepository.findById(id);
	}
	
	public Redes_sociales guardarPedido(Redes_sociales red_social) {
		return redes_socialesRepository.save(red_social);
	}
	
	public boolean eleminarPedido(Long id) {
		if (redes_socialesRepository.existsById(id)) {
			redes_socialesRepository.deleteById(id);
			return true;
		}else {
			return false;
		}
		
	}
}