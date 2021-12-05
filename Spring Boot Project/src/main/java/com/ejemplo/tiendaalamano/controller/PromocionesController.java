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

import com.ejemplo.tiendaalamano.model.Promociones;

import com.ejemplo.tiendaalamano.service.PromocionesService;


@RestController
@CrossOrigin(origins="*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE})
@RequestMapping("/api/promociones")
public class PromocionesController {
	
	@Autowired
	PromocionesService promocionesService;
	
	@GetMapping()
	public List<Promociones> obtenerPedidos(){
		return promocionesService.obtenerPedidos();
	}
	
	@GetMapping(path="/{id}")
	public Optional<Promociones> obtenerPedidosId(@PathVariable("id") Long id){
		return promocionesService.obtenerPedidosId(id);
	}
	
	@PostMapping
	public Promociones guaradarPedido(@RequestBody Promociones promocion) {
		return promocionesService.guardarPedido(promocion);
	}
	
	@DeleteMapping(path="/{id}")
	public String eliminarPedido(@PathVariable("id") Long id ) {
		if (promocionesService.eleminarPedido(id)) {
			return "Se elimino correctamente la promoción";
		}else {
			return "No existe la promoción";
		}
	}

}