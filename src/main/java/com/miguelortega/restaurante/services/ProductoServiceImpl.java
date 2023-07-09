package com.miguelortega.restaurante.services;

import com.miguelortega.restaurante.entities.Producto;
import com.miguelortega.restaurante.repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService{

    @Autowired
    ProductoRepository productoRepository;

    @Override
    @Transactional
    public List<Producto> listarTodosLosProductos(){
        return (List<Producto>) productoRepository.findAll();
    };
}
