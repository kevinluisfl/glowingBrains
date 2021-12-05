package com.ejemplo.tiendaalamano.model;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;




@Entity
@Table(name="pedidos")
public class Pedidos implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_pedido;
	
	@Column(length = 15, nullable=false)
	private int usuario_id;
	
	@Column(length = 15, nullable=false)
	private float total_impuestos;
	
	@Column(length = 15, nullable=false)
	private float total_descuentos;
	
	@Column(length = 15, nullable=false)
	private float total_pago;
	
	@Column(length = 15, nullable=false)
	@Temporal(TemporalType.DATE)
	private Date fecha_pedido;
	
	@Column(length = 20, nullable=false)
	private String estado_pedido;
	
	@Column(length = 15, nullable=false)
	private String tipo_entrega;
	
	@Column(length = 15, nullable=false)
	private String observaciones_pedido;
	
	@Column(length = 15, nullable=false)
	private String tipo_pago;
	
	@Column(length = 15, nullable=false)
	private int punto_venta_id;
	
	@Column(length = 15, nullable=false)
	private int direccion_id;
	
	@Column(name = "fecha_entrega")
	@Temporal(TemporalType.DATE)
	private Date fecha_entrega;
	
	@Column(length = 15, nullable=false)
	private int puntos_acumulados;
	
	@Column(length = 20, nullable=false)
	private String cupon_descuento;
	
	@Column(length = 15, nullable=false)
	private int pagar_puntos;
	
	@Column(length = 15, nullable=false)
	private int domiciliario_id;
	
	@Column(length = 15, nullable=false)
	private float costo_envio;
	
	@Column(length = 15, nullable=false)
	private int calificaion_pedido;
	
	@Column(length = 15, nullable=false)
	private String comentario_calificacion;
	
	@Column(length = 15, nullable=false)
	private boolean lista_mercado;

	@JsonIgnoreProperties(value={"pedidos", "hibernateLazyInitializer", "handler"}, allowSetters=true)
	@ManyToOne(fetch = FetchType.LAZY) 
	private Usuarios usuarios;
	
	@JsonIgnoreProperties(value={"pedidos", "hibernateLazyInitializer", "handler"}, allowSetters=true)
	@ManyToOne(fetch = FetchType.LAZY) 
	private Domiciliarios domiciliarios;
	
	@JsonIgnoreProperties(value={"pedidos", "hibernateLazyInitializer", "handler"}, allowSetters=true)
	@ManyToOne(fetch = FetchType.LAZY) 
	private Direcciones direcciones;
	
	@JsonIgnoreProperties(value={"pedidos", "hibernateLazyInitializer", "handler"}, allowSetters=true)
	@ManyToOne(fetch = FetchType.LAZY) 
	private Puntos_ventas puntos_ventas;
	
	@JsonIgnoreProperties(value = {"pedidos", "hibernateLazyInitializer", "handler"}, allowSetters = true)
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pedidos", cascade = CascadeType.ALL)
    private List<Detalle_pedidos> detalle_pedidos;
	
	@JsonIgnoreProperties(value = {"pedidos", "hibernateLazyInitializer", "handler"}, allowSetters = true)
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pedidos", cascade = CascadeType.ALL)
    private List<Pqr> pqr;

	public Long getId_pedido() {
		return id_pedido;
	}

	public void setId_pedido(Long id_pedido) {
		this.id_pedido = id_pedido;
	}

	public int getUsuario_id() {
		return usuario_id;
	}

	public void setUsuario_id(int usuario_id) {
		this.usuario_id = usuario_id;
	}

	public float getTotal_impuestos() {
		return total_impuestos;
	}

	public void setTotal_impuestos(float total_impuestos) {
		this.total_impuestos = total_impuestos;
	}

	public float getTotal_descuentos() {
		return total_descuentos;
	}

	public void setTotal_descuentos(float total_descuentos) {
		this.total_descuentos = total_descuentos;
	}

	public float getTotal_pago() {
		return total_pago;
	}

	public void setTotal_pago(float total_pago) {
		this.total_pago = total_pago;
	}

	public Date getFecha_pedido() {
		return fecha_pedido;
	}

	public void setFecha_pedido(Date fecha_pedido) {
		this.fecha_pedido = fecha_pedido;
	}

	public String getEstado_pedido() {
		return estado_pedido;
	}

	public void setEstado_pedido(String estado_pedido) {
		this.estado_pedido = estado_pedido;
	}

	public String getTipo_entrega() {
		return tipo_entrega;
	}

	public void setTipo_entrega(String tipo_entrega) {
		this.tipo_entrega = tipo_entrega;
	}

	public String getObservaciones_pedido() {
		return observaciones_pedido;
	}

	public void setObservaciones_pedido(String observaciones_pedido) {
		this.observaciones_pedido = observaciones_pedido;
	}

	public String getTipo_pago() {
		return tipo_pago;
	}

	public void setTipo_pago(String tipo_pago) {
		this.tipo_pago = tipo_pago;
	}

	public int getPunto_venta_id() {
		return punto_venta_id;
	}

	public void setPunto_venta_id(int punto_venta_id) {
		this.punto_venta_id = punto_venta_id;
	}

	public int getDireccion_id() {
		return direccion_id;
	}

	public void setDireccion_id(int direccion_id) {
		this.direccion_id = direccion_id;
	}

	public Date getFecha_entrega() {
		return fecha_entrega;
	}

	public void setFecha_entrega(Date fecha_entrega) {
		this.fecha_entrega = fecha_entrega;
	}

	public int getPuntos_acumulados() {
		return puntos_acumulados;
	}

	public void setPuntos_acumulados(int puntos_acumulados) {
		this.puntos_acumulados = puntos_acumulados;
	}

	public String getCupon_descuento() {
		return cupon_descuento;
	}

	public void setCupon_descuento(String cupon_descuento) {
		this.cupon_descuento = cupon_descuento;
	}

	public int getPagar_puntos() {
		return pagar_puntos;
	}

	public void setPagar_puntos(int pagar_puntos) {
		this.pagar_puntos = pagar_puntos;
	}

	public int getDomiciliario_id() {
		return domiciliario_id;
	}

	public void setDomiciliario_id(int domiciliario_id) {
		this.domiciliario_id = domiciliario_id;
	}

	public float getCosto_envio() {
		return costo_envio;
	}

	public void setCosto_envio(float costo_envio) {
		this.costo_envio = costo_envio;
	}

	public int getCalificaion_pedido() {
		return calificaion_pedido;
	}

	public void setCalificaion_pedido(int calificaion_pedido) {
		this.calificaion_pedido = calificaion_pedido;
	}

	public String getComentario_calificacion() {
		return comentario_calificacion;
	}

	public void setComentario_calificacion(String comentario_calificacion) {
		this.comentario_calificacion = comentario_calificacion;
	}

	public boolean isLista_mercado() {
		return lista_mercado;
	}

	public void setLista_mercado(boolean lista_mercado) {
		this.lista_mercado = lista_mercado;
	}

	public Usuarios getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Usuarios usuarios) {
		this.usuarios = usuarios;
	}

	public Domiciliarios getDomiciliarios() {
		return domiciliarios;
	}

	public void setDomiciliarios(Domiciliarios domiciliarios) {
		this.domiciliarios = domiciliarios;
	}

	public Direcciones getDirecciones() {
		return direcciones;
	}

	public void setDirecciones(Direcciones direcciones) {
		this.direcciones = direcciones;
	}

	public Puntos_ventas getPuntos_ventas() {
		return puntos_ventas;
	}

	public void setPuntos_ventas(Puntos_ventas puntos_ventas) {
		this.puntos_ventas = puntos_ventas;
	}

	public List<Detalle_pedidos> getDetalle_pedidos() {
		return detalle_pedidos;
	}

	public void setDetalle_pedidos(List<Detalle_pedidos> detalle_pedidos) {
		this.detalle_pedidos = detalle_pedidos;
	}

	public List<Pqr> getPqr() {
		return pqr;
	}

	public void setPqr(List<Pqr> pqr) {
		this.pqr = pqr;
	}

	

}
