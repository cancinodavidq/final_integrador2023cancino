package com.example.finalintegrador.Controllers;

import com.example.finalintegrador.Services.ProductoService;
import com.example.finalintegrador.models.ProductoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@CrossOrigin(origins ="*", allowedHeaders = "*")
@RestController
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    ProductoService productoService;

    @GetMapping()
    public ArrayList<ProductoModel> obtenerProductos(){
        return productoService.obtenerProductos();
    }

    @PostMapping()
    public ProductoModel guardarProducto(@RequestBody ProductoModel producto){
        return this.productoService.guardarProducto(producto);
    }
    @GetMapping(path = "/{id}")
    public Optional<ProductoModel> obtenerProductoId(@PathVariable("id") Long id){
        return this.productoService.obtenerPorId(id);
    }
}
