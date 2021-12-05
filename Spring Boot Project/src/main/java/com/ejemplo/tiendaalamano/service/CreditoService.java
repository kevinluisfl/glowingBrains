package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import com.ejemplo.tiendaalamano.model.Creditos;

public interface CreditoService {
	public List<Creditos> findAll();
	public Optional<Creditos> findById(Long id);
	public Creditos save(Creditos credito);
	public void deleteById(Long id);
	
}
