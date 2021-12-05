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
import com.ejemplo.tiendaalamano.model.Departamentos;
import com.ejemplo.tiendaalamano.service.DepartamentosService;


@RestController
@CrossOrigin(origins="*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
@RequestMapping("/api/departamentos")
public class DepartamentosController {
	
	@Autowired
	DepartamentosService departamentosService;
	
	@GetMapping()
	public List<Departamentos> obtenerPedidos(){
		return departamentosService.obtenerPedidos();
	}
	
	@GetMapping(path="/{id}")
	public Optional<Departamentos> obtenerPedidosId(@PathVariable("id") Long id){
		return departamentosService.obtenerPedidosId(id);
	}
	
	@PutMapping(path="/{id}")
	public Departamentos actualizarCiudad(@RequestBody Departamentos departamento, @PathVariable("id") Long id) {
		departamento.setId_departamento(id);
		return departamentosService.guardarPedido(departamento);
	}
	
	@PostMapping
	public Departamentos guaradarPedido(@RequestBody Departamentos departamento) {
		return departamentosService.guardarPedido(departamento);
	}
	
	@DeleteMapping(path="/{id}")
	public String eliminarPedido(@PathVariable("id") Long id ) {
		if (departamentosService.eleminarPedido(id)) {
			return "Se elimino correctamente el departamento";
		}else {
			return "No existe el departamento";
		}
	}

}