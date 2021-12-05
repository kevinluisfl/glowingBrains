package com.ejemplo.tiendaalamano.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="categorias")

public class Categorias implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_categoria;
	
	@Column(length = 15, nullable=false)
	private String nombre_categoria;
	
	@JsonIgnoreProperties(value={"categorias", "hibernateLazyInitializer", "handler"}, allowSetters=true)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "categorias", cascade = CascadeType.ALL) 
	private Subcategorias subcategorias;
	
	
	public int getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}

	public String getNombre_categoria() {
		return nombre_categoria;
	}

	public void setNombre_categoria(String nombre_categoria) {
		this.nombre_categoria = nombre_categoria;
	}

	public Subcategorias getSubcategorias() {
		return subcategorias;
	}

	public void setSubcategorias(Subcategorias subcategorias) {
		this.subcategorias = subcategorias;
	}

	
	
	
	

	
	
	
	
	
}
