package com.ejemplo.tiendaalamano.model;

import java.io.Serializable;
import java.sql.Date;

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
@Table(name="promociones")
public class Promociones implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_promocion;
	
	@Column(length = 15, nullable=false)
	private int producto_id;
	
	@Column(length = 15, nullable=false)
	private String descripcion_promocion;
	
	@Column(length = 15, nullable=false)
	private float valor_descuento_promocion;
	
	@Column(length = 15, nullable=false)
	private String codigo_promocion;
	
	@Column(length = 15, nullable=false)
	private String estado_promocion;
	
	@Column(length = 15, nullable=false)
	private String nombre_departamento;
	
	@Column(name = "fecha_inicio_promocion")
	@Temporal(TemporalType.DATE)
	private Date fecha_inicio_promocion;
	
	@Column(length = 15, nullable=false)
	@Temporal(TemporalType.DATE)
	private Date fecha_fin_promocion;
	
	@JsonIgnoreProperties(value={"promociones", "hibernateLazyInitializer", "handler"}, allowSetters=true)
	@ManyToOne(fetch = FetchType.LAZY) 
	private Productos productos;

	public int getId_promocion() {
		return id_promocion;
	}

	public void setId_promocion(int id_promocion) {
		this.id_promocion = id_promocion;
	}

	public int getProducto_id() {
		return producto_id;
	}

	public void setProducto_id(int producto_id) {
		this.producto_id = producto_id;
	}

	public String getDescripcion_promocion() {
		return descripcion_promocion;
	}

	public void setDescripcion_promocion(String descripcion_promocion) {
		this.descripcion_promocion = descripcion_promocion;
	}

	public float getValor_descuento_promocion() {
		return valor_descuento_promocion;
	}

	public void setValor_descuento_promocion(float valor_descuento_promocion) {
		this.valor_descuento_promocion = valor_descuento_promocion;
	}

	public String getCodigo_promocion() {
		return codigo_promocion;
	}

	public void setCodigo_promocion(String codigo_promocion) {
		this.codigo_promocion = codigo_promocion;
	}

	public String getEstado_promocion() {
		return estado_promocion;
	}

	public void setEstado_promocion(String estado_promocion) {
		this.estado_promocion = estado_promocion;
	}

	public String getNombre_departamento() {
		return nombre_departamento;
	}

	public void setNombre_departamento(String nombre_departamento) {
		this.nombre_departamento = nombre_departamento;
	}

	public Date getFecha_inicio_promocion() {
		return fecha_inicio_promocion;
	}

	public void setFecha_inicio_promocion(Date fecha_inicio_promocion) {
		this.fecha_inicio_promocion = fecha_inicio_promocion;
	}

	public Date getFecha_fin_promocion() {
		return fecha_fin_promocion;
	}

	public void setFecha_fin_promocion(Date fecha_fin_promocion) {
		this.fecha_fin_promocion = fecha_fin_promocion;
	}

	public Productos getProductos() {
		return productos;
	}

	public void setProductos(Productos productos) {
		this.productos = productos;
	}
	
	
	
	

	
	
}
