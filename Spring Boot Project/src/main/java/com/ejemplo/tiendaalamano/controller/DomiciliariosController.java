package com.ejemplo.tiendaalamano.controller;

import java.util.List;

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

import com.ejemplo.tiendaalamano.model.Direcciones;
import com.ejemplo.tiendaalamano.model.Domiciliarios;
import com.ejemplo.tiendaalamano.service.DomiciliariosService;


@RestController
@CrossOrigin(origins="*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
@RequestMapping("/api/domiciliarios")
public class DomiciliariosController {
	
	@Autowired
	DomiciliariosService domiciliariosService;
	
	@GetMapping()
	public List<Domiciliarios> obtenerPedidos(){
		return domiciliariosService.obtenerPedidos();
	}
	
	@PutMapping(path="/{id}")
	public Domiciliarios actualizarCiudad(@RequestBody Domiciliarios domiciliario, @PathVariable("id") Long id) {
		domiciliario.setId_domiciliario(id);
		return domiciliariosService.guardarPedido(domiciliario);
	}
	
	@PostMapping
	public Domiciliarios guaradarPedido(@RequestBody Domiciliarios domiciliario) {
		return domiciliariosService.guardarPedido(domiciliario);
	}
	
	@DeleteMapping(path="/{id}")
	public String eliminarPedido(@PathVariable("id") Long id ) {
		if (domiciliariosService.eleminarPedido(id)) {
			return "Se elimino correctamente el domiciliario";
		}else {
			return "No existe el domiciliario";
		}
	}

}