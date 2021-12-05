package com.ejemplo.tiendaalamano.controller;

import com.ejemplo.tiendaalamano.model.historial_creditos;
import com.ejemplo.tiendaalamano.service.HistorialCreditoService;

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
@RequestMapping("/api/historialcredito")
public class HistorialCreditoController {
    @Autowired
    private HistorialCreditoService historialcreditoService;

    @RequestMapping(value = "/", method = RequestMethod.POST, consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void createHistorialCredito(@RequestBody @Validated historial_creditos historialcredito) {
    	historialcreditoService.save(historialcredito);
    }
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<historial_creditos> getAllHistorialCreditos() {
        return historialcreditoService.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
	public ResponseEntity<?> update(@RequestBody historial_creditos historialcreditoDetalle,@PathVariable Long id){
		Optional<historial_creditos> historialcredito = historialcreditoService.findById(id);
		if(!historialcredito.isPresent()) {
			return ResponseEntity.notFound().build();
		} 
		BeanUtils.copyProperties(historialcreditoDetalle, historialcredito.get());
		historialcredito.get().setId_historial_credito(id);
		return ResponseEntity.status(HttpStatus.CREATED).body(historialcreditoService.save(historialcredito.get()));
	}
	
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteHistorialCreditoById(@PathVariable Long id) {
    	historialcreditoService.deleteById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Optional<historial_creditos> getHistorialcreditoById(@PathVariable Long id) {
        return historialcreditoService.findById(id);
    }
}
