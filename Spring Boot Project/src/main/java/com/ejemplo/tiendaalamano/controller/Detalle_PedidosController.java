package com.ejemplo.tiendaalamano.controller;

import java.util.List;

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

import com.ejemplo.tiendaalamano.model.Ciudades;

import com.ejemplo.tiendaalamano.service.CiudadesService;
import com.ejemplo.tiendaalamano.service.Detalle_PedidosService;


@RestController
@CrossOrigin(origins="*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE})
@RequestMapping("/detalle_pedidos")
public class Detalle_PedidosController {
	
	@Autowired
	Detalle_PedidosService detalle_PedidosService;
	
	@GetMapping()
	public List<Detalle_Pedidos> obtenerPedidos(){
		return detalle_PedidosService.obtenerPedidos();
	}
	
	@PostMapping
	public Detalle_Pedidos guaradarPedido(@RequestBody Detalle_Pedidos detalle_Pedido) {
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