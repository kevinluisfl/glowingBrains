package com.ejemplo.tiendaalamano.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity

@Table(name="categorias")
@Getter
@Setter
public class Categorias {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_categoria;
	
	@Column(length = 15, nullable=false)
	private String nombre_categoria;

	
	
	
	
	
}
