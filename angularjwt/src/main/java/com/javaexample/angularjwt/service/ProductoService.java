/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaexample.angularjwt.service;

import com.javaexample.angularjwt.entity.Producto;
import com.javaexample.angularjwt.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author jespadas
 */

@Service
@Transactional
public class ProductoService {

    @Autowired
    ProductoRepository productoRepository;

    public List<Producto> obtenerTodos(){
        List<Producto> lista = productoRepository.findAll();
        return lista;
    }

    public Optional<Producto> obtenerPorId(Long id){
        return productoRepository.findById(id);
    }

    public Optional<Producto> obtenerPorNombre(String np){
        return productoRepository.findByNombreProducto(np);
    }

    public void guardar(Producto producto){
        productoRepository.save(producto);
    }

    public void borrar(Long id){
        productoRepository.deleteById(id);
    }

    public boolean existePorNombre(String np){
        return productoRepository.existsByNombreProducto(np);
    }

    public boolean existePorId(Long id){
        return productoRepository.existsById(id);
    }
}
