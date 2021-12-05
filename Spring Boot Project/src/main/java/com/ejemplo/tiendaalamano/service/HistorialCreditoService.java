package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import com.ejemplo.tiendaalamano.model.historial_creditos;

public interface HistorialCreditoService {
	public List<historial_creditos> findAll();
	public Optional<historial_creditos> findById(Long id);
	public historial_creditos save(historial_creditos historialcredito);
	public void deleteById(Long id);
	
}
