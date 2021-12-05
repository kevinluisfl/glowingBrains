package com.ejemplo.tiendaalamano.controller;

import com.ejemplo.tiendaalamano.model.Subcategorias;
import com.ejemplo.tiendaalamano.service.SubcategoriaService;

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
@RequestMapping("/api/subcategorias")
public class SubcategoriaController {
    @Autowired
    private SubcategoriaService subcategoriaService;

    @RequestMapping(value = "/", method = RequestMethod.POST, consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void createSubcategoria(@RequestBody @Validated Subcategorias subcategoria) {
    	subcategoriaService.save(subcategoria);
    }
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Subcategorias> getAllSubcategorias() {
        return subcategoriaService.findAll();
    }

    @RequestMapping(value = "/", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
	public ResponseEntity<?> update(@RequestBody Subcategorias subcategoriaDetalle, Long id){
		Optional<Subcategorias> subcategoria = subcategoriaService.findById(id);
		if(!subcategoria.isPresent()) {
			return ResponseEntity.notFound().build();
		} 
		BeanUtils.copyProperties(subcategoriaDetalle, subcategoria.get());
//		subcategoria.get().setId_subcategoria(id);
		return ResponseEntity.status(HttpStatus.CREATED).body(subcategoriaService.save(subcategoria.get()));
	}
	
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteSubcategoriaById(@RequestParam Long id) {
    	subcategoriaService.deleteById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Optional<Subcategorias> getSubcategoriaById(Long id) {
        return subcategoriaService.findById(id);
    }
}
