package com.ejemplo.tiendaalamano.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="puntos_venta")
public class Puntos_venta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_puntos_ventao;
	
	@Column(length = 30, nullable=false)
	private String nombre_puntoventas;
	
	@Column(length = 50, nullable=false)
	private String direccion_puntosventas;
	
	@Column(length = 15, nullable=false)
	private String telefono_puntoventas;
	
	@Column(length = 25, nullable=false)
	private String coordenadas;
	
	@Column(length = 15, nullable=false)
	private int ciudad_id;

	
	
	
	
}
