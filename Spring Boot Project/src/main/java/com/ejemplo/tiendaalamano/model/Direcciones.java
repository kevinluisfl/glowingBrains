package com.ejemplo.tiendaalamano.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="direccion")
public class Direcciones {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_direccion;
	
	@Column(length = 50, nullable=false)
	private String direccion_envio;
	
	@Column(length = 15, nullable=false)
	private int usuario_id;
	
	@Column(length = 15, nullable=false)
	private int ciudad_id;

	
	
	
}
