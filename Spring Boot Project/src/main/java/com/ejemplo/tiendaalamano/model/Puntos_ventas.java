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
@Table(name="puntos_venta")
public class Puntos_ventas implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_puntos_ventao;
	
	@Column(length = 30, nullable=false)
	private String nombre_puntoventas;
	
	@Column(length = 50, nullable=false)
	private String direccion_puntosventas;
	
	@Column(length = 15, nullable=false)
	private String telefono_puntoventas;
	
	@Column(length = 25, nullable=false)
	private String coordenadas;
	
	@Column(length = 15, nullable=false)
	private int ciudad_id;

	@JsonIgnoreProperties(value={"puntos_venta", "hibernateLazyInitializer", "handler"}, allowSetters=true)
	@ManyToOne(fetch = FetchType.LAZY) 
	private Ciudades ciudades;
	
	@JsonIgnoreProperties(value = {"puntos_venta", "hibernateLazyInitializer", "handler"}, allowSetters = true)
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "puntos_venta", cascade = CascadeType.ALL)
    private List<Redes_sociales> redes_sociales;
	
	@JsonIgnoreProperties(value = {"puntos_venta", "hibernateLazyInitializer", "handler"}, allowSetters = true)
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "puntos_venta", cascade = CascadeType.ALL)
    private List<Pedidos> pedidos;

	public int getId_puntos_ventao() {
		return id_puntos_ventao;
	}

	public void setId_puntos_ventao(int id_puntos_ventao) {
		this.id_puntos_ventao = id_puntos_ventao;
	}

	public String getNombre_puntoventas() {
		return nombre_puntoventas;
	}

	public void setNombre_puntoventas(String nombre_puntoventas) {
		this.nombre_puntoventas = nombre_puntoventas;
	}

	public String getDireccion_puntosventas() {
		return direccion_puntosventas;
	}

	public void setDireccion_puntosventas(String direccion_puntosventas) {
		this.direccion_puntosventas = direccion_puntosventas;
	}

	public String getTelefono_puntoventas() {
		return telefono_puntoventas;
	}

	public void setTelefono_puntoventas(String telefono_puntoventas) {
		this.telefono_puntoventas = telefono_puntoventas;
	}

	public String getCoordenadas() {
		return coordenadas;
	}

	public void setCoordenadas(String coordenadas) {
		this.coordenadas = coordenadas;
	}

	public int getCiudad_id() {
		return ciudad_id;
	}

	public void setCiudad_id(int ciudad_id) {
		this.ciudad_id = ciudad_id;
	}

	public Ciudades getCiudades() {
		return ciudades;
	}

	public void setCiudades(Ciudades ciudades) {
		this.ciudades = ciudades;
	}

	public List<Redes_sociales> getRedes_sociales() {
		return redes_sociales;
	}

	public void setRedes_sociales(List<Redes_sociales> redes_sociales) {
		this.redes_sociales = redes_sociales;
	}

	public List<Pedidos> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedidos> pedidos) {
		this.pedidos = pedidos;
	}


	
	
}
