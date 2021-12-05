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
@Table(name="redes_sociales")
public class Redes_sociales  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_red_social;
	
	@Column(length = 15, nullable=false)
	private int puntoventa_id;
	
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
	
	@JsonIgnoreProperties(value={"redes_sociales", "hibernateLazyInitializer", "handler"}, allowSetters=true)
	@ManyToOne  (fetch = FetchType.LAZY) 
	private Puntos_ventas puntos_ventas;

	public Long getId_red_social() {
		return id_red_social;
	}

	public void setId_red_social(Long id_red_social) {
		this.id_red_social = id_red_social;
	}

	public int getPuntoventa_id() {
		return puntoventa_id;
	}

	public void setPuntoventa_id(int puntoventa_id) {
		this.puntoventa_id = puntoventa_id;
	}

	public String getCuenta_red_social() {
		return cuenta_red_social;
	}

	public void setCuenta_red_social(String cuenta_red_social) {
		this.cuenta_red_social = cuenta_red_social;
	}

	public String getRed_social() {
		return red_social;
	}

	public void setRed_social(String red_social) {
		this.red_social = red_social;
	}

	public String getUrl_red_social() {
		return url_red_social;
	}

	public void setUrl_red_social(String url_red_social) {
		this.url_red_social = url_red_social;
	}

	public String getClave_red_social() {
		return clave_red_social;
	}

	public void setClave_red_social(String clave_red_social) {
		this.clave_red_social = clave_red_social;
	}

	public String getNombre_administrador() {
		return nombre_administrador;
	}

	public void setNombre_administrador(String nombre_administrador) {
		this.nombre_administrador = nombre_administrador;
	}

	public Puntos_ventas getPuntos_ventas() {
		return puntos_ventas;
	}

	public void setPuntos_ventas(Puntos_ventas puntos_ventas) {
		this.puntos_ventas = puntos_ventas;
	}

	


	
	
	
	
	
}
