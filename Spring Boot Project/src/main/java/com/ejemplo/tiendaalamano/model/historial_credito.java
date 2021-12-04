package com.ejemplo.tiendaalamano.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="historial_credito")
public class historial_credito {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_historio_credito;
	
	@Column(length = 15, nullable=false)
	private int credito_id;
	
	@Column(length = 15, nullable=false)
	private float monto_pagado_credito;
	
	@Column(length = 15, nullable=false)
	private int fecha_pago_credito ;

	
	
}
