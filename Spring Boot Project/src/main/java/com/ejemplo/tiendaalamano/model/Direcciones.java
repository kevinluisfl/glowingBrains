package com.ejemplo.tiendaalamano.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="direccion")
public class Direcciones implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_direccion;
	
	@Column(length = 50, nullable=false)
	private String direccion_envio;
	
	@Column(length = 15, nullable=false)
	private int usuario_id;
	
	@Column(length = 15, nullable=false)
	private int ciudad_id;

	@JsonIgnoreProperties(value={"direcciones", "hibernateLazyInitializer", "handler"}, allowSetters=true)
	@ManyToOne(fetch = FetchType.LAZY) 
	private Usuarios usuario;
	
	@JsonIgnoreProperties(value={"direcciones", "hibernateLazyInitializer", "handler"}, allowSetters=true)
	@ManyToOne(fetch = FetchType.LAZY) 
	private Ciudades ciudad;
	
	@JsonIgnoreProperties(value={"direcciones", "hibernateLazyInitializer", "handler"}, allowSetters=true)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cliente", cascade = CascadeType.ALL) 
	private List<Pedidos> pedidos;

	public int getId_direccion() {
		return id_direccion;
	}

	public void setId_direccion(int id_direccion) {
		this.id_direccion = id_direccion;
	}

	public String getDireccion_envio() {
		return direccion_envio;
	}

	public void setDireccion_envio(String direccion_envio) {
		this.direccion_envio = direccion_envio;
	}

	public int getUsuario_id() {
		return usuario_id;
	}

	public void setUsuario_id(int usuario_id) {
		this.usuario_id = usuario_id;
	}

	public int getCiudad_id() {
		return ciudad_id;
	}

	public void setCiudad_id(int ciudad_id) {
		this.ciudad_id = ciudad_id;
	}

	public Usuarios getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuarios usuario) {
		this.usuario = usuario;
	}

	public Ciudades getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudades ciudad) {
		this.ciudad = ciudad;
	}

	public List<Pedidos> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedidos> pedidos) {
		this.pedidos = pedidos;
	}

	
	
}
