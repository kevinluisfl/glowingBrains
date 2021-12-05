package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ejemplo.tiendaalamano.model.Creditos;
import com.ejemplo.tiendaalamano.repository.CreditoRepository;

@Service
public class CreditoServiceImpl implements CreditoService {
	@Autowired
	private CreditoRepository creditoRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Creditos> findAll() {
		return creditoRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Creditos> findById(Long id) {
		return creditoRepository.findById(id);
	}

	@Override
	@Transactional
	public Creditos save(Creditos credito) {
		return creditoRepository.save(credito);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		creditoRepository.deleteById(id);
	}


}
