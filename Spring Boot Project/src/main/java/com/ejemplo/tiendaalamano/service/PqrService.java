package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.tiendaalamano.model.Pqr;
import com.ejemplo.tiendaalamano.repository.PqrRepository;


@Service
public class PqrService {
	@Autowired
	PqrRepository pqrRepository;


	public List<Pqr> obtenerPedidos() {
		return pqrRepository.findAll();
	}
	
	public Optional<Pqr> obtenerPedidosId(Long id) {
		return pqrRepository.findById(id);
	}
	
	public Pqr guardarPedido(Pqr pqr) {
		return pqrRepository.save(pqr);
	}
	
	public boolean eleminarPedido(Long id) {
		if (pqrRepository.existsById(id)) {
			pqrRepository.deleteById(id);
			return true;
		}else {
			return false;
		}
		
	}
}