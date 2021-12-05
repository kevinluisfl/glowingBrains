package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.tiendaalamano.model.Departamentos;
import com.ejemplo.tiendaalamano.repository.DepartamentosRepository;


@Service
public class DepartamentosService {
	@Autowired
	DepartamentosRepository departamentosRepository;


	public List<Departamentos> obtenerPedidos() {
		return departamentosRepository.findAll();
	}
	
	public Optional<Departamentos> obtenerPedidosId(Long id) {
		return departamentosRepository.findById(id);
	}
	
	
	public Departamentos guardarPedido(Departamentos departamento) {
		return departamentosRepository.save(departamento);

	}
	
	public boolean eleminarPedido(Long id) {
		if (departamentosRepository.existsById(id)) {
			departamentosRepository.deleteById(id);
			return true;
		}else {
			return false;
		}
		
	}
}