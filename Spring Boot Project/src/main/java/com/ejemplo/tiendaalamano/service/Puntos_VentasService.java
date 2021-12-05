package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.ejemplo.tiendaalamano.model.Puntos_ventas;

import com.ejemplo.tiendaalamano.repository.Puntos_VentasRepository;


@Service
public class Puntos_VentasService {
	@Autowired
	Puntos_VentasRepository puntos_VentasRepository;


	public List<Puntos_ventas> obtenerPedidos() {
		return puntos_VentasRepository.findAll();
	}
	
	public Optional<Puntos_ventas> obtenerPedidosId(Long id) {
		return puntos_VentasRepository.findById(id);
	}
	
	public Puntos_ventas guardarPedido(Puntos_ventas punto_venta) {
		return puntos_VentasRepository.save(punto_venta);
	}
	
	public boolean eleminarPedido(Long id) {
		if (puntos_VentasRepository.existsById(id)) {
			puntos_VentasRepository.deleteById(id);
			return true;
		}else {
			return false;
		}
		
	}
}