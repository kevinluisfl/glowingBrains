package com.ejemplo.tiendaalamano.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="comentarios_producto")
public class Comentarios_producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_comentario;
	
	@Column(length = 15, nullable=false)
	private int producto_id;
	
	@Column(length = 15, nullable=false)
	private int usuario_id;
	
	@Column(length = 15, nullable=false)
	@Temporal(TemporalType.DATE)
	private Date fecha_comentario;
	
	@Column(length = 15, nullable=false)
	private String comentario_producto;

	
}
