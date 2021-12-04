package com.ejemplo.tiendaalamano.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="ciudades")
public class Ciudades {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_ciudad;
	
	@Column(length = 30, nullable=false)
	private String nombre_ciudad;
	
	@Column(length = 15, nullable=false)
	private int departamento_id;

	
	
	
	

}
