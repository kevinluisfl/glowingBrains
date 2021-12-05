package com.ejemplo.tiendaalamano.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name="historial_credito")
public class Historial_credito implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_historio_credito;
	
	@Column(length = 15, nullable=false)
	private int credito_id;
	
	@Column(length = 15, nullable=false)
	private float monto_pagado_credito;
	
	@Column(length = 15, nullable=false)
	private int fecha_pago_credito ;

	@JsonIgnoreProperties(value={"historial_creditos", "hibernateLazyInitializer", "handler"}, allowSetters=true)
	@ManyToOne(fetch = FetchType.LAZY) 
	private Creditos creditos;

	public Long getId_historio_credito() {
		return id_historio_credito;
	}

	public void setId_historio_credito(Long id_historio_credito) {
		this.id_historio_credito = id_historio_credito;
	}

	public int getCredito_id() {
		return credito_id;
	}

	public void setCredito_id(int credito_id) {
		this.credito_id = credito_id;
	}

	public float getMonto_pagado_credito() {
		return monto_pagado_credito;
	}

	public void setMonto_pagado_credito(float monto_pagado_credito) {
		this.monto_pagado_credito = monto_pagado_credito;
	}

	public int getFecha_pago_credito() {
		return fecha_pago_credito;
	}

	public void setFecha_pago_credito(int fecha_pago_credito) {
		this.fecha_pago_credito = fecha_pago_credito;
	}

	public Creditos getCreditos() {
		return creditos;
	}

	public void setCreditos(Creditos creditos) {
		this.creditos = creditos;
	}
	
	
	
}
