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

@Entity
@Table(name="subcategorias")
public class Subcategorias implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_subcategoria;
	
	@Column(length = 15, nullable=false)
	private String nombre_subategoria;
	
	@Column(length = 15, nullable=false)
	private int categoria_id;
	
	@JsonIgnoreProperties(value={"subcategorias", "hibernateLazyInitializer", "handler"}, allowSetters=true)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "subcategorias", cascade = CascadeType.ALL) 
	private Productos productos;
	
	@JsonIgnoreProperties(value={"subcategorias", "hibernateLazyInitializer", "handler"}, allowSetters=true)
	@ManyToOne(fetch = FetchType.LAZY) 
	private Categorias categorias;

	public int getId_subcategoria() {
		return id_subcategoria;
	}

	public void setId_subcategoria(int id_subcategoria) {
		this.id_subcategoria = id_subcategoria;
	}

	public String getNombre_subategoria() {
		return nombre_subategoria;
	}

	public void setNombre_subategoria(String nombre_subategoria) {
		this.nombre_subategoria = nombre_subategoria;
	}

	public int getCategoria_id() {
		return categoria_id;
	}

	public void setCategoria_id(int categoria_id) {
		this.categoria_id = categoria_id;
	}

	public Productos getProductos() {
		return productos;
	}

	public void setProductos(Productos productos) {
		this.productos = productos;
	}

	public Categorias getCategorias() {
		return categorias;
	}

	public void setCategorias(Categorias categorias) {
		this.categorias = categorias;
	}
	
	

	
	
	
}
