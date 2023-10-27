package com.example.finalintegrador.Respositories;

import com.example.finalintegrador.models.ProductoModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends CrudRepository <ProductoModel, Long> {
    
}
