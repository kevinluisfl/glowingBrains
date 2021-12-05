package com.ejemplo.tiendaalamano.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ejemplo.tiendaalamano.model.Promociones;
import com.ejemplo.tiendaalamano.repository.PromocionesRepository;
import com.ejemplo.tiendaalamano.repository.Puntos_VentasRepository;


@Service
public class Puntos_VentasService {
	@Autowired
	Puntos_VentasRepository puntos_VentasRepository;


	public List<Puntos_Ventas> obtenerPedidos() {
		return puntos_VentasRepository.findAll();
	}
	
	public Puntos_Ventas guardarPedido(Puntos_Ventas punto_Venta) {
		return puntos_VentasRepository.save(punto_Venta);
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