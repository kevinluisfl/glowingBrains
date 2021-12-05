package com.ejemplo.tiendaalamano.model;

import java.io.Serializable;

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

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="ciudades")
public class Ciudades implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_ciudad;
	
	@Column(length = 30, nullable=false)
	private String nombre_ciudad;
	
	@Column(length = 15, nullable=false)
	private int departamento_id;

	@JsonIgnoreProperties(value={"ciudades", "hibernateLazyInitializer", "handler"}, allowSetters=true)
	@ManyToOne(fetch = FetchType.LAZY) 
	private Departamentos departamentos;
	
	@JsonIgnoreProperties(value={"ciudades", "hibernateLazyInitializer", "handler"}, allowSetters=true)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cliente", cascade = CascadeType.ALL) 
	private Direcciones direcciones;
	
	@JsonIgnoreProperties(value={"ciudades", "hibernateLazyInitializer", "handler"}, allowSetters=true)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ciudades", cascade = CascadeType.ALL) 
	private Puntos_ventas puntos_venta;

	public Long getId_ciudad() {
		return id_ciudad;
	}

	public void setId_ciudad(Long id_ciudad) {
		this.id_ciudad = id_ciudad;
	}

	public String getNombre_ciudad() {
		return nombre_ciudad;
	}

	public void setNombre_ciudad(String nombre_ciudad) {
		this.nombre_ciudad = nombre_ciudad;
	}

	public int getDepartamento_id() {
		return departamento_id;
	}

	public void setDepartamento_id(int departamento_id) {
		this.departamento_id = departamento_id;
	}

	public Departamentos getDepartamentos() {
		return departamentos;
	}

	public void setDepartamentos(Departamentos departamentos) {
		this.departamentos = departamentos;
	}

	public Direcciones getDirecciones() {
		return direcciones;
	}

	public void setDirecciones(Direcciones direcciones) {
		this.direcciones = direcciones;
	}

	public Puntos_ventas getPuntos_venta() {
		return puntos_venta;
	}

	public void setPuntos_venta(Puntos_ventas puntos_venta) {
		this.puntos_venta = puntos_venta;
	}
	
	
	

}
