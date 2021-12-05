package com.ejemplo.tiendaalamano.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="pqr")
public class Pqr implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_pqr;
		
	@Column(length = 15, nullable=false)
	private int usuario_id;
	
	@Column(length = 150, nullable=false)
	private String comentario_pqr;
	
	@Column(length = 15, nullable=false)
	private String tipo_pqr;
	
	@Column(length = 15, nullable=false)
	private int pedido_id;
	
	@JsonIgnoreProperties(value={"pqr", "hibernateLazyInitializer", "handler"}, allowSetters=true)
	@ManyToOne(fetch = FetchType.LAZY) 
	private Usuarios usuarios;
	
	@JsonIgnoreProperties(value={"pqr", "hibernateLazyInitializer", "handler"}, allowSetters=true)
	@ManyToOne(fetch = FetchType.LAZY) 
	private Pedidos pedidos;

	public Long getId_pqr() {
		return id_pqr;
	}

	public void setId_pqr(Long id_pqr) {
		this.id_pqr = id_pqr;
	}

	public int getUsuario_id() {
		return usuario_id;
	}

	public void setUsuario_id(int usuario_id) {
		this.usuario_id = usuario_id;
	}

	public String getComentario_pqr() {
		return comentario_pqr;
	}

	public void setComentario_pqr(String comentario_pqr) {
		this.comentario_pqr = comentario_pqr;
	}

	public String getTipo_pqr() {
		return tipo_pqr;
	}

	public void setTipo_pqr(String tipo_pqr) {
		this.tipo_pqr = tipo_pqr;
	}

	public int getPedido_id() {
		return pedido_id;
	}

	public void setPedido_id(int pedido_id) {
		this.pedido_id = pedido_id;
	}

	public Usuarios getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Usuarios usuarios) {
		this.usuarios = usuarios;
	}

	public Pedidos getPedidos() {
		return pedidos;
	}

	public void setPedidos(Pedidos pedidos) {
		this.pedidos = pedidos;
	}

	
	
	

	
	
}
