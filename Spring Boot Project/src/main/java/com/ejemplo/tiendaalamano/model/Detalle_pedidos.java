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
@Table(name="detalle_pedidos")
public class Detalle_pedidos implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_detalle_pedido;
	
	@Column(length = 50, nullable=false)
	private int pedido_id;
	
	@Column(length = 50, nullable=false)
	private int producto_id;
	
	@Column(length = 50, nullable=false)
	private String direccion_envio;
	
	@Column(length = 50, nullable=false)
	private int cantidad_producto;
	
	@Column(length = 50, nullable=false)
	private float precio_unitario;
	
	@Column(length = 50, nullable=false)
	private float impuesto_producto;
	
	@Column(length = 50, nullable=false)
	private float descuento_producto;
	
	@Column(length = 50, nullable=false)
	private float subtotal_producto;
	
	@JsonIgnoreProperties(value={"detalle_pedidos", "hibernateLazyInitializer", "handler"}, allowSetters=true)
	@ManyToOne(fetch = FetchType.LAZY) 
	private Productos productos;
	
	@JsonIgnoreProperties(value={"detalle_pedidos", "hibernateLazyInitializer", "handler"}, allowSetters=true)
	@ManyToOne(fetch = FetchType.LAZY) 
	private Pedidos pedidos;

	public Long getId_detalle_pedido() {
		return id_detalle_pedido;
	}

	public void setId_detalle_pedido(Long id_detalle_pedido) {
		this.id_detalle_pedido = id_detalle_pedido;
	}

	public int getPedido_id() {
		return pedido_id;
	}

	public void setPedido_id(int pedido_id) {
		this.pedido_id = pedido_id;
	}

	public int getProducto_id() {
		return producto_id;
	}

	public void setProducto_id(int producto_id) {
		this.producto_id = producto_id;
	}

	public String getDireccion_envio() {
		return direccion_envio;
	}

	public void setDireccion_envio(String direccion_envio) {
		this.direccion_envio = direccion_envio;
	}

	public int getCantidad_producto() {
		return cantidad_producto;
	}

	public void setCantidad_producto(int cantidad_producto) {
		this.cantidad_producto = cantidad_producto;
	}

	public float getPrecio_unitario() {
		return precio_unitario;
	}

	public void setPrecio_unitario(float precio_unitario) {
		this.precio_unitario = precio_unitario;
	}

	public float getImpuesto_producto() {
		return impuesto_producto;
	}

	public void setImpuesto_producto(float impuesto_producto) {
		this.impuesto_producto = impuesto_producto;
	}

	public float getDescuento_producto() {
		return descuento_producto;
	}

	public void setDescuento_producto(float descuento_producto) {
		this.descuento_producto = descuento_producto;
	}

	public float getSubtotal_producto() {
		return subtotal_producto;
	}

	public void setSubtotal_producto(float subtotal_producto) {
		this.subtotal_producto = subtotal_producto;
	}

	public Productos getProductos() {
		return productos;
	}

	public void setProductos(Productos productos) {
		this.productos = productos;
	}

	public Pedidos getPedidos() {
		return pedidos;
	}

	public void setPedidos(Pedidos pedidos) {
		this.pedidos = pedidos;
	}

	
	

}
