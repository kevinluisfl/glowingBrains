package com.ejemplo.tiendaalamano.controller;

import com.ejemplo.tiendaalamano.model.Usuarios;

import com.ejemplo.tiendaalamano.service.UsuariosServiceImpl;

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
@RequestMapping("/api/usuarios")
public class UsuarioController {
    @Autowired
    private UsuariosServiceImpl usuServicio;

    @RequestMapping(value = "/", method = RequestMethod.POST, consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void createUsuario(@RequestBody @Validated Usuarios usuario) {
    	usuServicio.save(usuario);
    }
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Usuarios> getAllUsuarios() {
        return usuServicio.findAll();
    }

    @RequestMapping(value = "/", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
	public ResponseEntity<?> update(@RequestBody Usuarios usuarioDetalle, Long id){
		Optional<Usuarios> usuario = usuServicio.findById(id);
		if(!usuario.isPresent()) {
			return ResponseEntity.notFound().build();
		} 
		BeanUtils.copyProperties(usuarioDetalle, usuario.get());
		usuario.get().setId_usuario(id);
		return ResponseEntity.status(HttpStatus.CREATED).body(usuServicio.save(usuario.get()));
	}
	
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteUsuarioById(@RequestParam Long id) {
    	usuServicio.deleteById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Optional<Usuarios> getUsuarioById(Long id) {
        return usuServicio.findById(id);
    }
}
