package com.ejemplo.tiendaalamano.controller;

import com.ejemplo.tiendaalamano.model.Comentarios_producto;
import com.ejemplo.tiendaalamano.service.ComentarioProductoService;

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
@RequestMapping("/api/comentariosproducto")
public class ComentarioProductoController {
    @Autowired
    private ComentarioProductoService comentarioproductoService;

    @RequestMapping(value = "/", method = RequestMethod.POST, consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void createComentarioProducto(@RequestBody @Validated Comentarios_producto comentarioproducto) {
    	comentarioproductoService.save(comentarioproducto);
    }
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Comentarios_producto> getAllComentariosProductos() {
        return comentarioproductoService.findAll();
    }

    @RequestMapping(value = "/", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
	public ResponseEntity<?> update(@RequestBody Comentarios_producto comentarioproductoDetalle, Long id){
		Optional<Comentarios_producto> comentarioproducto = comentarioproductoService.findById(id);
		if(!comentarioproducto.isPresent()) {
			return ResponseEntity.notFound().build();
		} 
		BeanUtils.copyProperties(comentarioproductoDetalle, comentarioproducto.get());
//		comentarioproducto.get().setId_comentarioProducto(id);
		return ResponseEntity.status(HttpStatus.CREATED).body(comentarioproductoService.save(comentarioproducto.get()));
	}
	
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteProductoById(@RequestParam Long id) {
    	comentarioproductoService.deleteById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Optional<Comentarios_producto> getProductoById(Long id) {
        return comentarioproductoService.findById(id);
    }
}
