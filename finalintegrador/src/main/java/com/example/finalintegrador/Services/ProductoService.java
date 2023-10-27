package com.example.finalintegrador.Services;

import com.example.finalintegrador.Respositories.ProductoRepository;
import com.example.finalintegrador.models.ProductoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ProductoService {

    @Autowired
    ProductoRepository productoRepository;

    public ArrayList<ProductoModel> obtenerProductos(){
        return (ArrayList<ProductoModel>) productoRepository.findAll();
    }

    public ProductoModel guardarProducto(ProductoModel producto){
        return productoRepository.save(producto);
    }
    public Optional<ProductoModel> obtenerPorId(Long id){
        return productoRepository.findById(id);
    }

}
