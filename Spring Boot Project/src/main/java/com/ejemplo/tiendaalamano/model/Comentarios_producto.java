package com.ejemplo.tiendaalamano.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="comentarios_producto")
public class Comentarios_producto implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_comentario_producto;
	
	@Column(length = 15, nullable=false)
	private int producto_id;
	
	@Column(length = 15, nullable=false)
	private int usuario_id;
	
	@Column(length = 15, nullable=false)
	@Temporal(TemporalType.DATE)
	private Date fecha_comentario;
	
	@Column(length = 150, nullable=false)
	private String comentario_producto;
	
	@JsonIgnoreProperties(value={"Comentarios_producto", "hibernateLazyInitializer", "handler"}, allowSetters=true)
	@ManyToOne(fetch = FetchType.LAZY) 
	private Usuarios usuarios;
	
	@JsonIgnoreProperties(value={"comentarios_producto", "hibernateLazyInitializer", "handler"}, allowSetters=true)
	@ManyToOne(fetch = FetchType.LAZY) 
	private Productos productos;

	public Long getId_comentario_producto() {
		return id_comentario_producto;
	}

	public void setId_comentario_producto(Long id_comentario_producto) {
		this.id_comentario_producto = id_comentario_producto;
	}

	public int getProducto_id() {
		return producto_id;
	}

	public void setProducto_id(int producto_id) {
		this.producto_id = producto_id;
	}

	public int getUsuario_id() {
		return usuario_id;
	}

	public void setUsuario_id(int usuario_id) {
		this.usuario_id = usuario_id;
	}

	public Date getFecha_comentario() {
		return fecha_comentario;
	}

	public void setFecha_comentario(Date fecha_comentario) {
		this.fecha_comentario = fecha_comentario;
	}

	public String getComentario_producto() {
		return comentario_producto;
	}

	public void setComentario_producto(String comentario_producto) {
		this.comentario_producto = comentario_producto;
	}

	public Usuarios getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Usuarios usuarios) {
		this.usuarios = usuarios;
	}

	public Productos getProductos() {
		return productos;
	}

	public void setProductos(Productos productos) {
		this.productos = productos;
	}

	
	

	
}
