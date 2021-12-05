package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ejemplo.tiendaalamano.model.historial_creditos;
import com.ejemplo.tiendaalamano.repository.HistorialCreditoRepository;

@Service
public class HistorialCreditoServiceImpl implements HistorialCreditoService {
	@Autowired
	private HistorialCreditoRepository historialcreditoRepository;

	@Override
	@Transactional(readOnly = true)
	public List<historial_creditos> findAll() {
		return historialcreditoRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<historial_creditos> findById(Long id) {
		return historialcreditoRepository.findById(id);
	}

	@Override
	@Transactional
	public historial_creditos save(historial_creditos historialcredito) {
		return historialcreditoRepository.save(historialcredito);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		historialcreditoRepository.deleteById(id);
	}


}
