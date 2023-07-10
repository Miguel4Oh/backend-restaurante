package com.miguelortega.restaurante.repositories;

import com.miguelortega.restaurante.entities.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductoRepository extends CrudRepository<Producto, Long> {

    @Query("select p from Producto p join fetch p.categoria c")
    public List<Producto> listarProductos();
}
