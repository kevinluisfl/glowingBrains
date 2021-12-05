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
@Table(name="productos")
public class Productos implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_producto;
	
	@Column(length = 30, nullable=false)
	private String nombre_producto;
	
	@Column(length = 15, nullable=false)
	private String marca_id;
	
	@Column(length = 15, nullable=false)
	private String existencias;
	
	@Column(length = 15, nullable=false)
	private float precio_producto;
	
	@Column(length = 15, nullable=false)
	private float impuesto;
	
	@Column(length = 15, nullable=false)
	private int subcategoria_id;
	
	@Column(length = 15, nullable=false)
	private int existencia_minima;
	
	@Column(length = 150, nullable=false)
	private String descripcion_producto;
	
	@JsonIgnoreProperties(value={"productos", "hibernateLazyInitializer", "handler"}, allowSetters=true)
	@ManyToOne(fetch = FetchType.LAZY) 
	private Marcas marcas;
	
	@JsonIgnoreProperties(value={"productos", "hibernateLazyInitializer", "handler"}, allowSetters=true)
	@ManyToOne(fetch = FetchType.LAZY) 
	private Subcategorias subcategorias;
	
	@JsonIgnoreProperties(value = {"productos", "hibernateLazyInitializer", "handler"}, allowSetters = true)
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "productos", cascade = CascadeType.ALL)
    private List<Promociones> promociones;
	
	@JsonIgnoreProperties(value = {"productos", "hibernateLazyInitializer", "handler"}, allowSetters = true)
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "productos", cascade = CascadeType.ALL)
    private List<Detalle_pedidos> detalle_pedidos;
	
	@JsonIgnoreProperties(value = {"productos", "hibernateLazyInitializer", "handler"}, allowSetters = true)
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "productos", cascade = CascadeType.ALL)
    private List<Comentarios_producto> comentarios_producto;

	public Long getId_producto() {
		return id_producto;
	}

	public void setId_producto(Long id_producto) {
		this.id_producto = id_producto;
	}

	public String getNombre_producto() {
		return nombre_producto;
	}

	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}

	public String getMarca_id() {
		return marca_id;
	}

	public void setMarca_id(String marca_id) {
		this.marca_id = marca_id;
	}

	public String getExistencias() {
		return existencias;
	}

	public void setExistencias(String existencias) {
		this.existencias = existencias;
	}

	public float getPrecio_producto() {
		return precio_producto;
	}

	public void setPrecio_producto(float precio_producto) {
		this.precio_producto = precio_producto;
	}

	public float getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(float impuesto) {
		this.impuesto = impuesto;
	}

	public int getSubcategoria_id() {
		return subcategoria_id;
	}

	public void setSubcategoria_id(int subcategoria_id) {
		this.subcategoria_id = subcategoria_id;
	}

	public int getExistencia_minima() {
		return existencia_minima;
	}

	public void setExistencia_minima(int existencia_minima) {
		this.existencia_minima = existencia_minima;
	}

	public String getDescripcion_producto() {
		return descripcion_producto;
	}

	public void setDescripcion_producto(String descripcion_producto) {
		this.descripcion_producto = descripcion_producto;
	}

	public Marcas getMarcas() {
		return marcas;
	}

	public void setMarcas(Marcas marcas) {
		this.marcas = marcas;
	}

	public Subcategorias getSubcategorias() {
		return subcategorias;
	}

	public void setSubcategorias(Subcategorias subcategorias) {
		this.subcategorias = subcategorias;
	}

	public List<Promociones> getPromociones() {
		return promociones;
	}

	public void setPromociones(List<Promociones> promociones) {
		this.promociones = promociones;
	}

	public List<Detalle_pedidos> getDetalle_pedidos() {
		return detalle_pedidos;
	}

	public void setDetalle_pedidos(List<Detalle_pedidos> detalle_pedidos) {
		this.detalle_pedidos = detalle_pedidos;
	}

	public List<Comentarios_producto> getComentarios_producto() {
		return comentarios_producto;
	}

	public void setComentarios_producto(List<Comentarios_producto> comentarios_producto) {
		this.comentarios_producto = comentarios_producto;
	}

	
	

	
	
}
