package com.miguelortega.restaurante.controllers;

import com.miguelortega.restaurante.entities.Producto;
import com.miguelortega.restaurante.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProuctoController {

    @Autowired
    ProductoService productoService;

    @GetMapping("/listado")
    public List<Producto> listadoDeProductos(){
        return productoService.listarTodosLosProductos();
    }
}
