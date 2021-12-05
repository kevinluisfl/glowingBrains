package com.ejemplo.tiendaalamano.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ejemplo.tiendaalamano.model.Historial_credito;

@Repository
public interface HistorialCreditoRepository extends JpaRepository<Historial_credito, Long> {
	
}
