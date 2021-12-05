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


import com.ejemplo.tiendaalamano.model.Direcciones;
import com.ejemplo.tiendaalamano.service.DireccionesService;


@RestController
@CrossOrigin(origins="*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE})
@RequestMapping("/api/direcciones")
public class DireccionesController {
	
	@Autowired
	DireccionesService direccionesService;
	
	@GetMapping()
	public List<Direcciones> obtenerPedidos(){
		return direccionesService.obtenerPedidos();
	}
	
	@GetMapping(path="/{id}")
	public Optional<Direcciones> obtenerPedidosId(@PathVariable("id") Long id){
		return direccionesService.obtenerPedidosId(id);
	}
	
	
	@PostMapping
	public Direcciones guaradarPedido(@RequestBody Direcciones direccion) {
		return direccionesService.guardarPedido(direccion);
	}
	
	@DeleteMapping(path="/{id}")
	public String eliminarPedido(@PathVariable("id") Long id ) {
		if (direccionesService.eleminarPedido(id)) {
			return "Se elimino correctamente la dirección";
		}else {
			return "No existe la dirección";
		}
	}

}