package com.ejemplo.tiendaalamano.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.ejemplo.tiendaalamano.model.Domiciliarios;


@Repository
public interface DomiciliariosRepository extends JpaRepository<Domiciliarios, Long>{

}