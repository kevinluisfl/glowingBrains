package com.ejemplo.tiendaalamano.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.ejemplo.tiendaalamano.model.Detalle_pedidos;


@Repository
public interface Detalle_PedidosRepository extends JpaRepository<Detalle_pedidos, Long>{

}