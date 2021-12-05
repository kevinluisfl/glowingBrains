package com.ejemplo.tiendaalamano.controller;

import com.ejemplo.tiendaalamano.model.Productos;
import com.ejemplo.tiendaalamano.service.ProductoService;

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
@RequestMapping("/api/productos")
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    @RequestMapping(value = "/", method = RequestMethod.POST, consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void createProducto(@RequestBody @Validated Productos producto) {
    	productoService.save(producto);
    }
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Productos> getAllProductos() {
        return productoService.findAll();
    }

    @RequestMapping(value = "/", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
	public ResponseEntity<?> update(@RequestBody Productos productoDetalle, Long id){
		Optional<Productos> producto = productoService.findById(id);
		if(!producto.isPresent()) {
			return ResponseEntity.notFound().build();
		} 
		BeanUtils.copyProperties(productoDetalle, producto.get());
		producto.get().setId_producto(id);
		return ResponseEntity.status(HttpStatus.CREATED).body(productoService.save(producto.get()));
	}
	
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteProductoById(@RequestParam Long id) {
    	productoService.deleteById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Optional<Productos> getProductoById(Long id) {
        return productoService.findById(id);
    }
}
