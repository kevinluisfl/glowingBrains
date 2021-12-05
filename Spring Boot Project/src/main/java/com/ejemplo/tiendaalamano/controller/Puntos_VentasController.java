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


import com.ejemplo.tiendaalamano.model.Puntos_Ventas;

import com.ejemplo.tiendaalamano.service.Puntos_VentasService;


@RestController
@CrossOrigin(origins="*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE})
@RequestMapping("/puntos_ventas")
public class Puntos_VentasController {
	
	@Autowired
	Puntos_VentasService puntos_VentasService;
	
	@GetMapping()
	public List<Puntos_Ventas> obtenerPedidos(){
		return puntos_VentasService.obtenerPedidos();
	}
	
	@PostMapping
	public Puntos_Ventas guaradarPedido(@RequestBody Puntos_Ventas punto_Ventas) {
		return puntos_VentasService.guardarPedido(punto_Ventas);
	}
	
	@DeleteMapping(path="/{id}")
	public String eliminarPedido(@PathVariable("id") Long id ) {
		if (puntos_VentasService.eleminarPedido(id)) {
			return "Se elimino correctamente el punto de venta";
		}else {
			return "No existe el punto de venta";
		}
	}

}