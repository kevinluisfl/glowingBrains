package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.tiendaalamano.model.Detalle_pedidos;
import com.ejemplo.tiendaalamano.repository.Detalle_PedidosRepository;


@Service
public class Detalle_PedidosService {
	@Autowired
	Detalle_PedidosRepository detalle_PedidosRepository;


	public List<Detalle_pedidos> obtenerPedidos() {
		return detalle_PedidosRepository.findAll();
	}
	
	public Optional<Detalle_pedidos> obtenerPedidosId(Long id) {
		return detalle_PedidosRepository.findById(id);
	}

	
	public Detalle_pedidos guardarPedido(Detalle_pedidos detalle_pedido) {
		return detalle_PedidosRepository.save(detalle_pedido);
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