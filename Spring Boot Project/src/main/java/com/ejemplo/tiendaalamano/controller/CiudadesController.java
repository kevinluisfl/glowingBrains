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

import com.ejemplo.tiendaalamano.model.Ciudades;

import com.ejemplo.tiendaalamano.service.CiudadesService;


@RestController
@CrossOrigin(origins="*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
@RequestMapping("/api/ciudades")
public class CiudadesController {
	
	@Autowired
	CiudadesService ciudadesService;
	
	@GetMapping()
	public List<Ciudades> obtenerPedidos(){
		return ciudadesService.obtenerPedidos();
	}
	
	@GetMapping(path="/{id}")
	public Optional<Ciudades> obtenerPedidosId(@PathVariable("id") Long id){
		return ciudadesService.obtenerPedidosId(id);
	}
	
	@PostMapping
	public Ciudades guaradarPedido(@RequestBody Ciudades ciudad) {
		return ciudadesService.guardarPedido(ciudad);
	}
	
	@PutMapping(path="/{id}")
	public Ciudades actualizarCiudad(@RequestBody Ciudades ciudad, @PathVariable("id") Long id) {
		ciudad.setId_ciudad(id);
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
