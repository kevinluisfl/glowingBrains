package com.ejemplo.tiendaalamano.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.tiendaalamano.model.Departamentos;
import com.ejemplo.tiendaalamano.model.Detalle_pedidos;

import com.ejemplo.tiendaalamano.service.Detalle_PedidosService;


@RestController
@CrossOrigin(origins="*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
@RequestMapping("/api/detalle_pedidos")
public class Detalle_PedidosController {
	
	@Autowired
	Detalle_PedidosService detalle_PedidosService;
	
	@GetMapping()
	public List<Detalle_pedidos> obtenerPedidos(){
		return detalle_PedidosService.obtenerPedidos();
	}
	
	@GetMapping(path="/{id}")
	public Optional<Detalle_pedidos> obtenerPedidosId(@PathVariable("id") Long id){
		return detalle_PedidosService.obtenerPedidosId(id);
	}
	
	@PutMapping(path="/{id}")
	public Detalle_pedidos actualizarCiudad(@RequestBody Detalle_pedidos detalle_Pedido, @PathVariable("id") Long id) {
		detalle_Pedido.setId_detalle_pedido(id);
		return detalle_PedidosService.guardarPedido(detalle_Pedido);
	}
	
	@PostMapping
	public Detalle_pedidos guaradarPedido(@RequestBody Detalle_pedidos detalle_Pedido) {
		return detalle_PedidosService.guardarPedido(detalle_Pedido);
	}
	
	@DeleteMapping(path="/{id}")
	public String eliminarPedido(@PathVariable("id") Long id ) {
		if (detalle_PedidosService.eleminarPedido(id)) {
			return "Se elimino correctamente el producto de la lista";
		}else {
			return "No existe el producto en la lista";
		}
	}

}