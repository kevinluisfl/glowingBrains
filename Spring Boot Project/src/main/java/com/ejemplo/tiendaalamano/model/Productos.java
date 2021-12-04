package com.ejemplo.tiendaalamano.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="producto")
public class Productos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_producto;
	
	@Column(length = 30, nullable=false)
	private String nombre_producto;
	
	@Column(length = 15, nullable=false)
	private String marca_id;
	
	@Column(length = 15, nullable=false)
	private String existencias;
	
	@Column(length = 15, nullable=false)
	private float precio_producto;
	
	@Column(length = 15, nullable=false)
	private float impuesto;
	
	@Column(length = 15, nullable=false)
	private int subcategoria_id;
	
	@Column(length = 15, nullable=false)
	private int existencia_minima;
	
	@Column(length = 150, nullable=false)
	private String descripcion_producto;

	
	
}
