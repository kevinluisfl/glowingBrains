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
	private int id_historio_pqr;
		
	@Column(length = 15, nullable=false)
	private int cliente_id;
	
	@Column(length = 15, nullable=false)
	private String comentario_pqr;
	
	@Column(length = 15, nullable=false)
	private String Tipo_pqr;
	
	@Column(length = 15, nullable=false)
	private int pedido_id;
	
	@JsonIgnoreProperties(value={"pqr", "hibernateLazyInitializer", "handler"}, allowSetters=true)
	@ManyToOne(fetch = FetchType.LAZY) 
	private Usuarios usuario;

	public int getId_historio_pqr() {
		return id_historio_pqr;
	}

	public void setId_historio_pqr(int id_historio_pqr) {
		this.id_historio_pqr = id_historio_pqr;
	}

	public int getCliente_id() {
		return cliente_id;
	}

	public void setCliente_id(int cliente_id) {
		this.cliente_id = cliente_id;
	}

	public String getComentario_pqr() {
		return comentario_pqr;
	}

	public void setComentario_pqr(String comentario_pqr) {
		this.comentario_pqr = comentario_pqr;
	}

	public String getTipo_pqr() {
		return Tipo_pqr;
	}

	public void setTipo_pqr(String tipo_pqr) {
		Tipo_pqr = tipo_pqr;
	}

	public int getPedido_id() {
		return pedido_id;
	}

	public void setPedido_id(int pedido_id) {
		this.pedido_id = pedido_id;
	}

	public Usuarios getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuarios usuario) {
		this.usuario = usuario;
	}
	
	

	
	
}
