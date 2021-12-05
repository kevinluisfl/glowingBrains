package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ejemplo.tiendaalamano.model.Historial_credito;
import com.ejemplo.tiendaalamano.repository.HistorialCreditoRepository;

@Service
public class HistorialCreditoServiceImpl implements HistorialCreditoService {
	@Autowired
	private HistorialCreditoRepository historialcreditoRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Historial_credito> findAll() {
		return historialcreditoRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Historial_credito> findById(Long id) {
		return historialcreditoRepository.findById(id);
	}

	@Override
	@Transactional
	public Historial_credito save(Historial_credito historialcredito) {
		return historialcreditoRepository.save(historialcredito);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		historialcreditoRepository.deleteById(id);
	}


}
