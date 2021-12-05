package com.ejemplo.tiendaalamano.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.tiendaalamano.model.Departamentos;
import com.ejemplo.tiendaalamano.repository.DepartamentosRepository;
import com.ejemplo.tiendaalamano.repository.Detalle_PedidosRepository;


@Service
public class Detalle_PedidosService {
	@Autowired
	Detalle_PedidosRepository detalle_PedidosRepository;


	public List<Detalle_Pedidos> obtenerPedidos() {
		return detalle_PedidosRepository.findAll();
	}
	
	public Departamentos guardarPedido(Detalle_Pedidos detalle_Pedido) {
		return detalle_PedidosRepository.save(detalle_Pedido);
	}
	
	public boolean eleminarPedido(Long id) {
		if (detalle_PedidosRepository.existsById(id)) {
			detalle_PedidosRepository.deleteById(id);
			return true;
		}else {
			return false;
		}
		
	}
}