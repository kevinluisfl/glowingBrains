package com.ejemplo.tiendaalamano.controller;

import com.ejemplo.tiendaalamano.model.Creditos;
import com.ejemplo.tiendaalamano.service.CreditoService;

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
@RequestMapping("/api/creditos")
public class CreditoController {
    @Autowired
    private CreditoService creditoService;

    @RequestMapping(value = "/", method = RequestMethod.POST, consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void createCredito(@RequestBody @Validated Creditos credito) {
    	creditoService.save(credito);
    }
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Creditos> getAllCreditos() {
        return creditoService.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
	public ResponseEntity<?> update(@RequestBody Creditos creditoDetalle,@PathVariable Long id){
		Optional<Creditos> credito = creditoService.findById(id);
		if(!credito.isPresent()) {
			return ResponseEntity.notFound().build();
		} 
		BeanUtils.copyProperties(creditoDetalle, credito.get());
		credito.get().setId_credito(id);
		return ResponseEntity.status(HttpStatus.CREATED).body(creditoService.save(credito.get()));
	}
	
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteCreditoById(@PathVariable Long id) {
    	creditoService.deleteById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Optional<Creditos> getCreditoById(@PathVariable Long id) {
        return creditoService.findById(id);
    }
}
