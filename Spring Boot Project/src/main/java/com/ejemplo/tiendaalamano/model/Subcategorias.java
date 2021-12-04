package com.ejemplo.tiendaalamano.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="subcategorias")
public class Subcategorias {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_subcategoria;
	
	@Column(length = 15, nullable=false)
	private String nombre_subategoria;
	
	@Column(length = 15, nullable=false)
	private int categoria_id;

	
	
	
}
