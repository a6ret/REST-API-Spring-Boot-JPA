package com.utsjava.model.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.utsjava.model.entities.Product;

//menggunakan function built in crudrepository dan mengambil tipe data primary key (long) dari entity product
public interface ProductRepo extends CrudRepository<Product, Long>{
    List<Product> findByNameContains(String name);   
}
