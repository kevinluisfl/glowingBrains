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
@Table(name="puntos_ventas")
public class Puntos_ventas implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_puntoventa;
	
	@Column(length = 30, nullable=false)
	private String nombre_puntoventa;
	
	@Column(length = 50, nullable=false)
	private String direccion_puntoventa;
	
	@Column(length = 15, nullable=false)
	private String telefono_puntoventa;
	
	@Column(length = 25, nullable=false)
	private String coordenadas;
	
	@Column(length = 15, nullable=false)
	private int ciudad_id;

	@JsonIgnoreProperties(value={"puntos_ventas", "hibernateLazyInitializer", "handler"}, allowSetters=true)
	@ManyToOne(fetch = FetchType.LAZY) 
	private Ciudades ciudades;
	
	@JsonIgnoreProperties(value = {"puntos_ventas", "hibernateLazyInitializer", "handler"}, allowSetters = true)
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "puntos_ventas", cascade = CascadeType.ALL)
    private List<Redes_sociales> redes_sociales;
	
	@JsonIgnoreProperties(value = {"puntos_ventas", "hibernateLazyInitializer", "handler"}, allowSetters = true)
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "puntos_ventas", cascade = CascadeType.ALL)
    private List<Pedidos> pedidos;

	public Long getId_puntoventa() {
		return id_puntoventa;
	}

	public void setId_puntoventa(Long id_puntoventa) {
		this.id_puntoventa = id_puntoventa;
	}

	public String getNombre_puntoventa() {
		return nombre_puntoventa;
	}

	public void setNombre_puntoventa(String nombre_puntoventa) {
		this.nombre_puntoventa = nombre_puntoventa;
	}

	public String getDireccion_puntoventa() {
		return direccion_puntoventa;
	}

	public void setDireccion_puntoventa(String direccion_puntoventa) {
		this.direccion_puntoventa = direccion_puntoventa;
	}

	public String getTelefono_puntoventa() {
		return telefono_puntoventa;
	}

	public void setTelefono_puntoventa(String telefono_puntoventa) {
		this.telefono_puntoventa = telefono_puntoventa;
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
