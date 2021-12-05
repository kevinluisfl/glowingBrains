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
@Table(name="domiciliarios")
public class Domiciliarios implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_domiciliario;
	

	@Column(length = 30, nullable=false)
	private String nombre_domiciliario;
	

	@Column(length = 15, nullable=false)
	private String telefono_domiciliario;
	
	@JsonIgnoreProperties(value={"domiciliarios", "hibernateLazyInitializer", "handler"}, allowSetters=true)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "domiciliarios", cascade = CascadeType.ALL) 
	private List<Pedidos> pedidos;

	public int getId_domiciliario() {
		return id_domiciliario;
	}

	public void setId_domiciliario(int id_domiciliario) {
		this.id_domiciliario = id_domiciliario;
	}

	public String getNombre_domiciliario() {
		return nombre_domiciliario;
	}

	public void setNombre_domiciliario(String nombre_domiciliario) {
		this.nombre_domiciliario = nombre_domiciliario;
	}

	public String getTelefono_domiciliario() {
		return telefono_domiciliario;
	}

	public void setTelefono_domiciliario(String telefono_domiciliario) {
		this.telefono_domiciliario = telefono_domiciliario;
	}

	public List<Pedidos> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedidos> pedidos) {
		this.pedidos = pedidos;
	}


	

	
}
