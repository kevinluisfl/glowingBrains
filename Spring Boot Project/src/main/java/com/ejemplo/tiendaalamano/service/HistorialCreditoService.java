package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import com.ejemplo.tiendaalamano.model.Historial_credito;

public interface HistorialCreditoService {
	public List<Historial_credito> findAll();
	public Optional<Historial_credito> findById(Long id);
	public Historial_credito save(Historial_credito historialcredito);
	public void deleteById(Long id);
	
}
