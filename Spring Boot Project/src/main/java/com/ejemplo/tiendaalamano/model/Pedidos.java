package com.ejemplo.tiendaalamano.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="pedidos")
public class Pedidos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_producto;
	
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
	
	@Column(length = 15, nullable=false)
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
	
	@Column(length = 15, nullable=false)
	private String cupon_descuento;
	
	@Column(length = 15, nullable=false)
	private int pagar_con_puntos;
	
	@Column(length = 15, nullable=false)
	private int domiciliario_id;
	
	@Column(length = 15, nullable=false)
	private float costo_envio;
	
	@Column(length = 15, nullable=false)
	private int calificaion_pedido;
	
	@Column(length = 15, nullable=false)
	private String comentario_calificacion;
	
	@Column(length = 15, nullable=false)
	private boolean si_lista;

	
	
	
}
