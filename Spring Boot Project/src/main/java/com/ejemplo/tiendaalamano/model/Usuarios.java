package com.ejemplo.tiendaalamano.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
public class Usuarios implements Serializable{
	private static final long serialVersionUID = -5773962493781143007L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_usuario;
	
		
	@Column(length = 15, nullable=false)
	private String usuario;
	
	@Column(length = 15, nullable=false)
	private String clave;
	
	@Column(length = 30, nullable=false)
	private String nombre_usuario;
	
	@Column(length = 15, nullable=false)
	private String rol;
	
	@Column(length = 15, nullable=false)
	private String telefono_usuario;
	
	@Column(length = 15, nullable=false)
	private String tipo_documento;
	
	@Column(length = 15, nullable=false)
	private String documento;
	
	@Column(length = 20, nullable=false)
	private String ciudad_usuario;	
	
	@Column(length = 30, nullable=false)
	private String email_usuario;
	
	@Column(length = 25, nullable=false)
	private int puntos_totales;

	
	
}
	
	
	
	
