package com.ejemplo.tiendaalamano.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.ejemplo.tiendaalamano.model.Pqr;


@Repository
public interface PqrRepository extends JpaRepository<Pqr, Long>{

}