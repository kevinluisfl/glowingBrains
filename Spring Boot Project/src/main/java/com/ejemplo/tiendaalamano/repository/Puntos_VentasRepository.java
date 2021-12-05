package com.ejemplo.tiendaalamano.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.ejemplo.tiendaalamano.model.Puntos_Ventas;


@Repository
public interface Puntos_VentasRepository extends JpaRepository<Puntos_Ventas, Long>{

}