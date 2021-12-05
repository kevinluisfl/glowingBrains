package com.ejemplo.tiendaalamano.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name="historial_credito")
public class historial_creditos implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_historial_credito;
	
	@Column(length = 15, nullable=false)
	private int credito_id;
	
	@Column(length = 15, nullable=false)
	private float monto_pagado_credito;
	
	@Column(name = "fecha_entrega")
	@Temporal(TemporalType.DATE)
	private Date fecha_pago_credito ;

	@JsonIgnoreProperties(value={"historial_credito", "hibernateLazyInitializer", "handler"}, allowSetters=true)
	@ManyToOne(fetch = FetchType.LAZY) 
	private Creditos creditos;

	public Long getId_historial_credito() {
		return id_historial_credito;
	}

	public void setId_historial_credito(Long id_historial_credito) {
		this.id_historial_credito = id_historial_credito;
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

	public Date getFecha_pago_credito() {
		return fecha_pago_credito;
	}

	public void setFecha_pago_credito(Date fecha_pago_credito) {
		this.fecha_pago_credito = fecha_pago_credito;
	}

	public Creditos getCreditos() {
		return creditos;
	}

	public void setCreditos(Creditos creditos) {
		this.creditos = creditos;
	}

	
	
}
