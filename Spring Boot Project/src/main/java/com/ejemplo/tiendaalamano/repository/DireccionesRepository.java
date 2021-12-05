package com.ejemplo.tiendaalamano.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.ejemplo.tiendaalamano.model.Direcciones;


@Repository
public interface DireccionesRepository extends JpaRepository<Direcciones, Long>{

}