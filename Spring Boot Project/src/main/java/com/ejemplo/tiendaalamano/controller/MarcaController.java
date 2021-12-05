package com.ejemplo.tiendaalamano.controller;

import com.ejemplo.tiendaalamano.model.Marcas;
import com.ejemplo.tiendaalamano.service.MarcaService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/marcas")
public class MarcaController {
    @Autowired
    private MarcaService marcaService;

    @RequestMapping(value = "/", method = RequestMethod.POST, consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void createMarca(@RequestBody @Validated Marcas marca) {
    	marcaService.save(marca);
    }
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Marcas> getAllMarcas() {
        return marcaService.findAll();
    }

    @RequestMapping(value = "/", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
	public ResponseEntity<?> update(@RequestBody Marcas marcaDetalle, Long id){
		Optional<Marcas> marca = marcaService.findById(id);
		if(!marca.isPresent()) {
			return ResponseEntity.notFound().build();
		} 
		BeanUtils.copyProperties(marcaDetalle, marca.get());
		marca.get().setId_marca(id);
		return ResponseEntity.status(HttpStatus.CREATED).body(marcaService.save(marca.get()));
	}
	
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteMarcaById(@RequestParam Long id) {
    	marcaService.deleteById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Optional<Marcas> getMarcaById(Long id) {
        return marcaService.findById(id);
    }
}
