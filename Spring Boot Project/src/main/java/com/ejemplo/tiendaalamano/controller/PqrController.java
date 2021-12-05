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

import com.ejemplo.tiendaalamano.model.Pedidos;
import com.ejemplo.tiendaalamano.model.Pqr;
import com.ejemplo.tiendaalamano.service.PqrService;


@RestController
@CrossOrigin(origins="*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
@RequestMapping("/api/pqr")
public class PqrController {
	
	@Autowired
	PqrService pqrService;
	
	@GetMapping()
	public List<Pqr> obtenerPedidos(){
		return pqrService.obtenerPedidos();
	}
	
	@GetMapping(path="/{id}")
	public Optional<Pqr> obtenerPedidosId(@PathVariable("id") Long id){
		return pqrService.obtenerPedidosId(id);
	}
	
	@PutMapping(path="/{id}")
	public Pqr actualizarCiudad(@RequestBody Pqr pqr, @PathVariable("id") Long id) {
		pqr.setId_pqr(id);
		return pqrService.guardarPedido(pqr);
	}
	
	@PostMapping
	public Pqr guaradarPedido(@RequestBody Pqr pqr) {
		return pqrService.guardarPedido(pqr);
	}
	
	@DeleteMapping(path="/{id}")
	public String eliminarPedido(@PathVariable("id") Long id ) {
		if (pqrService.eleminarPedido(id)) {
			return "Se elimino correctamente la pqr";
		}else {
			return "No existe la pqr";
		}
	}

}