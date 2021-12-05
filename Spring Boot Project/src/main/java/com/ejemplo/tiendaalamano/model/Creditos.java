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
@Table(name="creditos")
public class Creditos implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_credito;
	
	@Column(length = 15, nullable=false)
	private int usuario_id;
	
	@Column(length = 15, nullable=false)
	private float monto_credito;
	
	@Column(length = 15, nullable=false)
	private int cuotas_totales_credito;
	
	@Column(length = 15, nullable=false)
	private int cuota_actual;
	
	@Column(length = 15, nullable=false)
	@Temporal(TemporalType.DATE)
	private Date fecha_inicio;
	
	@Column(length = 15, nullable=false)
	@Temporal(TemporalType.DATE)
	private Date fecha_final;
	
	@Column(length = 15, nullable=false)
	private float valor_cuota;
	
	@Column(length = 15, nullable=false)
	private String estado_credito;
	
	@Column(length = 15, nullable=false)
	@Temporal(TemporalType.DATE)
	private Date fecha_limite_pago_credito;
	
	@Column(length = 15, nullable=false)
	private int cuotas_mora;
	
	@Column(length = 15, nullable=false)
	private float interes_corrientes;
	
	@Column(length = 15, nullable=false)
	private float interes_mora;

	@JsonIgnoreProperties(value={"creditos", "hibernateLazyInitializer", "handler"}, allowSetters=true)
	@ManyToOne(fetch = FetchType.LAZY) 
	private Usuarios usuarios;
	
	@JsonIgnoreProperties(value={"creditos", "hibernateLazyInitializer", "handler"}, allowSetters=true)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "creditos", cascade = CascadeType.ALL) 
	private List<Historial_credito> historial_credito;

	public Long getId_credito() {
		return id_credito;
	}

	public void setId_credito(Long id_credito) {
		this.id_credito = id_credito;
	}

	public int getUsuario_id() {
		return usuario_id;
	}

	public void setUsuario_id(int usuario_id) {
		this.usuario_id = usuario_id;
	}

	public float getMonto_credito() {
		return monto_credito;
	}

	public void setMonto_credito(float monto_credito) {
		this.monto_credito = monto_credito;
	}

	public int getCuotas_totales_credito() {
		return cuotas_totales_credito;
	}

	public void setCuotas_totales_credito(int cuotas_totales_credito) {
		this.cuotas_totales_credito = cuotas_totales_credito;
	}

	public int getCuota_actual() {
		return cuota_actual;
	}

	public void setCuota_actual(int cuota_actual) {
		this.cuota_actual = cuota_actual;
	}

	public Date getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public Date getFecha_final() {
		return fecha_final;
	}

	public void setFecha_final(Date fecha_final) {
		this.fecha_final = fecha_final;
	}

	public float getValor_cuota() {
		return valor_cuota;
	}

	public void setValor_cuota(float valor_cuota) {
		this.valor_cuota = valor_cuota;
	}

	public String getEstado_credito() {
		return estado_credito;
	}

	public void setEstado_credito(String estado_credito) {
		this.estado_credito = estado_credito;
	}

	public Date getFecha_limite_pago_credito() {
		return fecha_limite_pago_credito;
	}

	public void setFecha_limite_pago_credito(Date fecha_limite_pago_credito) {
		this.fecha_limite_pago_credito = fecha_limite_pago_credito;
	}

	public int getCuotas_mora() {
		return cuotas_mora;
	}

	public void setCuotas_mora(int cuotas_mora) {
		this.cuotas_mora = cuotas_mora;
	}

	public float getInteres_corrientes() {
		return interes_corrientes;
	}

	public void setInteres_corrientes(float interes_corrientes) {
		this.interes_corrientes = interes_corrientes;
	}

	public float getInteres_mora() {
		return interes_mora;
	}

	public void setInteres_mora(float interes_mora) {
		this.interes_mora = interes_mora;
	}



	public Usuarios getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Usuarios usuarios) {
		this.usuarios = usuarios;
	}

	public List<Historial_credito> getHistorial_credito() {
		return historial_credito;
	}

	public void setHistorial_credito(List<Historial_credito> historial_credito) {
		this.historial_credito = historial_credito;
	}

	
	
	
}
