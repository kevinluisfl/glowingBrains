package com.ejemplo.tiendaalamano.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ejemplo.tiendaalamano.model.Ciudades;


@Repository
public interface CiudadesRepository extends JpaRepository<Ciudades, Long>{

}