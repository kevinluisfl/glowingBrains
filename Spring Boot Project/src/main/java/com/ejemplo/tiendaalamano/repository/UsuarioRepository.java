package com.ejemplo.tiendaalamano.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ejemplo.tiendaalamano.model.Usuarios;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuarios, Long> {
	@Query("SELECT p FROM usuarios p WHERE p.usuario = :username and p.clave = :password")
	public List<Usuarios> login(String username, String password); 
}
