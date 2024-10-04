package com.david.di.crud.apirest.services;

import com.david.di.crud.apirest.entities.Product;
import com.david.di.crud.apirest.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ProducServiceJPA implements ProductService {

    @Autowired
    private ProductRepository productRepository;


    @Override
    @Transactional(readOnly = true)
    public List<Product> findAll() {
        return (List<Product>) productRepository.findAll();
    }


    @Override
    @Transactional(readOnly = true)
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }


    @Override
    @Transactional
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    @Transactional
    public Optional<Product> update(Long id, Product product) {
        Optional<Product> optionalProduct = productRepository.findById(id);
        if(optionalProduct.isPresent())
         {
            Product productUpdate = optionalProduct.orElseThrow();
             productUpdate.setName(product.getName());
             productUpdate.setDescription(product.getDescription());
             productUpdate.setPrice(product.getPrice());

            return Optional.of(productRepository.save(productUpdate));
        }
        return optionalProduct;
    }

    @Override
    @Transactional
    public Optional<Product> delete(Long id) {
        Optional<Product> productDb = productRepository.findById(id);
        productDb.ifPresent(product1 -> {productRepository.delete(product1);});
        return productDb;
    }

    @Override
    @Transactional(readOnly = true)
    public boolean existsByName(String name) {
        return productRepository.existsByName(name);
    }
}
