package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.tiendaalamano.model.Pedidos;
import com.ejemplo.tiendaalamano.repository.PedidosRepository;

@Service
public class PedidosService {
	@Autowired
	PedidosRepository pedidosRepository;


	public List<Pedidos> obtenerPedidos() {
		return pedidosRepository.findAll();
	}
	
	public Optional<Pedidos> obtenerPedidosId(Long id) {
		return pedidosRepository.findById(id);
	}
	
	public Pedidos guardarPedido(Pedidos pedido) {
		return pedidosRepository.save(pedido);
	}
	
	public boolean eleminarPedido(Long id) {
		if (pedidosRepository.existsById(id)) {
			pedidosRepository.deleteById(id);
			return true;
		}else {
			return false;
		}
		
	}
}
