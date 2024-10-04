package com.david.di.crud.apirest.repositories;

import com.david.di.crud.apirest.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {

    boolean existsByName(String name);

}
