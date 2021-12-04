package com.ejemplo.tiendaalamano.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="redes_sociales")
public class Redes_sociales {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_red_social;
	
	@Column(length = 15, nullable=false)
	private int id_puntodeventa;
	
	@Column(length = 20, nullable=false)
	private String cuenta_red_social;
	
	@Column(length = 20, nullable=false)
	private String red_social;
	
	@Column(length = 50, nullable=false)
	private String url_red_social;
	
	@Column(length = 15, nullable=false)
	private String clave_red_social	;
	
	@Column(length = 30, nullable=false)
	private String nombre_administrador;

	
	
	
	
	
}
