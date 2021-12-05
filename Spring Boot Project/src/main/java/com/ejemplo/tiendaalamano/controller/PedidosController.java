package com.ejemplo.tiendaalamano.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.tiendaalamano.model.Pedidos;
import com.ejemplo.tiendaalamano.service.PedidosService;

@RestController
@CrossOrigin(origins="*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE})
@RequestMapping("/api/pedidos")
public class PedidosController {
	
	@Autowired
	PedidosService pedidosService;
	
	@GetMapping()
	public List<Pedidos> obtenerPedidos(){
		return pedidosService.obtenerPedidos();
	}
	
	@GetMapping(path="/{id}")
	public Optional<Pedidos> obtenerPedidosId(@PathVariable("id") Long id){
		return pedidosService.obtenerPedidosId(id);
	}
	
	@PostMapping
	public Pedidos guaradarPedido(@RequestBody Pedidos pedido) {
		return pedidosService.guardarPedido(pedido);
	}
	
	@DeleteMapping(path="/{id}")
	public String eliminarPedido(@PathVariable("id") Long id ) {
		if (pedidosService.eleminarPedido(id)) {
			return "Se elimino correctamente el pedido";
		}else {
			return "No existe el pedido";
		}
	}

}
