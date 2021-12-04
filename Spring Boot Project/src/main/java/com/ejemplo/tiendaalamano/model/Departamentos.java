package com.ejemplo.tiendaalamano.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="departamentos")
public class Departamentos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_departamento;
	
	@Column(length = 30, nullable=false)
	private String nombre_departamento;

	
	
	
	
}
