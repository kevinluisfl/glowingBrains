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


@RestController
@CrossOrigin(origins="*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE})
@RequestMapping("/ciudades")
public class CiudadesController {
	
	@Autowired
	CiudadesService ciudadesService;
	
	@GetMapping()
	public List<Ciudades> obtenerPedidos(){
		return ciudadesService.obtenerPedidos();
	}
	
	@PostMapping
	public Ciudades guaradarPedido(@RequestBody Ciudades ciudad) {
		return ciudadesService.guardarPedido(ciudad);
	}
	
	@DeleteMapping(path="/{id}")
	public String eliminarPedido(@PathVariable("id") Long id ) {
		if (ciudadesService.eleminarPedido(id)) {
			return "Se elimino correctamente la ciudad";
		}else {
			return "No existe la ciudad";
		}
	}

}
