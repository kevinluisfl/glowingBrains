package com.ejemplo.tiendaalamano.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="promociones")
public class Promociones {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_promocion;
	
	@Column(length = 15, nullable=false)
	private int producto_id;
	
	@Column(length = 15, nullable=false)
	private String descripcion_promocion;
	
	@Column(length = 15, nullable=false)
	private float valor_descuento_promocion;
	
	@Column(length = 15, nullable=false)
	private String codigo_promocion;
	
	@Column(length = 15, nullable=false)
	private String estado_promocion;
	
	@Column(length = 15, nullable=false)
	private String nombre_departamento;
	
	@Column(name = "fecha_inicio_promocion")
	@Temporal(TemporalType.DATE)
	private Date fecha_inicio_promocion;
	
	@Column(length = 15, nullable=false)
	@Temporal(TemporalType.DATE)
	private Date fecha_fin_promocion;

	
	
}
