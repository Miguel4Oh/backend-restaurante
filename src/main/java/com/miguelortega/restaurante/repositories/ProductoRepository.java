package com.miguelortega.restaurante.repositories;

import com.miguelortega.restaurante.entities.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoRepository extends CrudRepository<Producto, Long> {
}
