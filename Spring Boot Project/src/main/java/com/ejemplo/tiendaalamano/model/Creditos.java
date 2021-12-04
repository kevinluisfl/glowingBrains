package com.ejemplo.tiendaalamano.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="creditos")
public class Creditos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_credito;
	
	@Column(length = 15, nullable=false)
	private int usuario_id;
	
	@Column(length = 15, nullable=false)
	private float monto_credito;
	
	@Column(length = 15, nullable=false)
	private int cuotas_totales_credito;
	
	@Column(length = 15, nullable=false)
	private int cuota_actual;
	
	@Column(length = 15, nullable=false)
	@Temporal(TemporalType.DATE)
	private Date fecha_inicio;
	
	@Column(length = 15, nullable=false)
	@Temporal(TemporalType.DATE)
	private Date fecha_final;
	
	@Column(length = 15, nullable=false)
	private float valor_cuota;
	
	@Column(length = 15, nullable=false)
	private String estado_credito;
	
	@Column(length = 15, nullable=false)
	@Temporal(TemporalType.DATE)
	private Date fecha_limite_pago_credito;
	
	@Column(length = 15, nullable=false)
	private int cuotas_mora;
	
	@Column(length = 15, nullable=false)
	private float interes_corrientes;
	
	@Column(length = 15, nullable=false)
	private float interes_mora;

	
	
}
