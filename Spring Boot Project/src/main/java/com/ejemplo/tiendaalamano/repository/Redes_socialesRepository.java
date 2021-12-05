package com.ejemplo.tiendaalamano.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.ejemplo.tiendaalamano.model.Redes_sociales;


@Repository
public interface Redes_socialesRepository extends JpaRepository<Redes_sociales, Long>{

}