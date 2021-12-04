package com.ejemplo.tiendaalamano.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pqr")
public class Pqr {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_historio_pqr;
		
	@Column(length = 15, nullable=false)
	private int cliente_id;
	
	@Column(length = 15, nullable=false)
	private String comentario_pqr;
	
	@Column(length = 15, nullable=false)
	private String Tipo_pqr;
	
	@Column(length = 15, nullable=false)
	private int pedido_id;

	
	
}
