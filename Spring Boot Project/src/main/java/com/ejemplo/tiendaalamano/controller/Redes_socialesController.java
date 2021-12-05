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


import com.ejemplo.tiendaalamano.model.Redes_sociales;

import com.ejemplo.tiendaalamano.service.Redes_socialesService;


@RestController
@CrossOrigin(origins="*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE})
@RequestMapping("/api/redes_sociales")
public class Redes_socialesController {
	
	@Autowired
	Redes_socialesService redes_socialesService;
	
	@GetMapping()
	public List<Redes_sociales> obtenerPedidos(){
		return redes_socialesService.obtenerPedidos();
	}
	
	@GetMapping(path="/{id}")
	public Optional<Redes_sociales> obtenerPedidosId(@PathVariable("id") Long id){
		return redes_socialesService.obtenerPedidosId(id);
	}
	
	@PostMapping
	public Redes_sociales guaradarPedido(@RequestBody Redes_sociales rede_social) {
		return redes_socialesService.guardarPedido(rede_social);
	}
	
	@DeleteMapping(path="/{id}")
	public String eliminarPedido(@PathVariable("id") Long id ) {
		if (redes_socialesService.eleminarPedido(id)) {
			return "Se elimino correctamente la Red social";
		}else {
			return "No existe la Red social";
		}
	}

}