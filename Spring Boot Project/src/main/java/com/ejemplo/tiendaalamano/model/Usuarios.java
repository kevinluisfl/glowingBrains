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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name="usuarios")
public class Usuarios implements Serializable{
	
  	private static final long serialVersionUID = -5773962493781143007L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_usuario;
	
		
	@Column(length = 15, nullable=false)
	private String usuario;
	
	@Column(length = 15, nullable=false)
	private String clave;
	
	
	@Column(length = 30, nullable=false)
	private String nombre_usuario;
	
	@Column(length = 15, nullable=false)
	private String rol;
	
	@Column(length = 15, nullable=false)
	private String telefono_usuario;
	
	@Column(length = 15, nullable=false)
	private String tipo_documento;
	
	@Column(length = 15, nullable=false)
	private String documento;
	
	@Column(length = 20, nullable=false)
	private String ciudad_usuario;	
	
	@Column(length = 30, nullable=false)
	private String email_usuario;
	
	@Column(length = 25, nullable=false)
	private int puntos_totales;
	
    @JsonIgnoreProperties(value = {"usuarios", "hibernateLazyInitializer", "handler"}, allowSetters = true)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuarios", cascade = CascadeType.ALL)
	 private List<Comentarios_producto> comentarios_producto;
    
    @JsonIgnoreProperties(value = {"usuarios", "hibernateLazyInitializer", "handler"}, allowSetters = true)
 	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuarios", cascade = CascadeType.ALL)
 	 private  List<Pedidos> pedidos;
    
    @JsonIgnoreProperties(value = {"usuarios", "hibernateLazyInitializer", "handler"}, allowSetters = true)
 	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuarios", cascade = CascadeType.ALL)
 	 private List<Pqr> pqr;
    
    @JsonIgnoreProperties(value = {"usuarios", "hibernateLazyInitializer", "handler"}, allowSetters = true)
 	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuarios", cascade = CascadeType.ALL)
 	 private List<Direcciones> direcciones;

	public Long getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Long id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getNombre_usuario() {
		return nombre_usuario;
	}

	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public String getTelefono_usuario() {
		return telefono_usuario;
	}

	public void setTelefono_usuario(String telefono_usuario) {
		this.telefono_usuario = telefono_usuario;
	}

	public String getTipo_documento() {
		return tipo_documento;
	}

	public void setTipo_documento(String tipo_documento) {
		this.tipo_documento = tipo_documento;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getCiudad_usuario() {
		return ciudad_usuario;
	}

	public void setCiudad_usuario(String ciudad_usuario) {
		this.ciudad_usuario = ciudad_usuario;
	}

	public String getEmail_usuario() {
		return email_usuario;
	}

	public void setEmail_usuario(String email_usuario) {
		this.email_usuario = email_usuario;
	}

	public int getPuntos_totales() {
		return puntos_totales;
	}

	public void setPuntos_totales(int puntos_totales) {
		this.puntos_totales = puntos_totales;
	}

	public List<Comentarios_producto> getComentarios_producto() {
		return comentarios_producto;
	}

	public void setComentarios_producto(List<Comentarios_producto> comentarios_producto) {
		this.comentarios_producto = comentarios_producto;
	}

	public List<Pedidos> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedidos> pedidos) {
		this.pedidos = pedidos;
	}

	public List<Pqr> getPqr() {
		return pqr;
	}

	public void setPqr(List<Pqr> pqr) {
		this.pqr = pqr;
	}

	public List<Direcciones> getDirecciones() {
		return direcciones;
	}

	public void setDirecciones(List<Direcciones> direcciones) {
		this.direcciones = direcciones;
	}

	
	
	
}
	
	
	
	
