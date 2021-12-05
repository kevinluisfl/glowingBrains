package com.ejemplo.tiendaalamano.controller;

import com.ejemplo.tiendaalamano.model.Categorias;
import com.ejemplo.tiendaalamano.service.CategoriaService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/categorias")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;

    @RequestMapping(value = "/", method = RequestMethod.POST, consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void createCategoria(@RequestBody @Validated Categorias categoria) {
    	categoriaService.save(categoria);
    }
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Categorias> getAllCategorias() {
        return categoriaService.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
	public ResponseEntity<?> update(@RequestBody Categorias categoriaDetalle, @PathVariable Long id){
		Optional<Categorias> categoria = categoriaService.findById(id);
		if(!categoria.isPresent()) {
			return ResponseEntity.notFound().build();
		} 
		BeanUtils.copyProperties(categoriaDetalle, categoria.get());
		categoria.get().setId_categoria(id);
		return ResponseEntity.status(HttpStatus.CREATED).body(categoriaService.save(categoria.get()));
	}
	
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteCategoriaById(@PathVariable Long id) {
    	categoriaService.deleteById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Optional<Categorias> getCategoriaById(@PathVariable Long id) {
        return categoriaService.findById(id);
    }
}
