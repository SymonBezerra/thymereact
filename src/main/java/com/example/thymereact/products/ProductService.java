package com.example.thymereact.products;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.thymereact.generic.ProductAlreadyExistsException;
import com.example.thymereact.generic.ProductNotFoundException;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<ProductEntity> findAll() {
        return repository.findAll();
    }

    public ProductEntity findById(String id) throws ProductNotFoundException {
        return repository.findById(id)
        .orElseThrow(() -> new ProductNotFoundException("Product not found: " + id));
    }

    public ProductEntity findByName(String name) throws ProductNotFoundException {
        return repository.findByName(name)
        .orElseThrow(() -> new ProductNotFoundException("Product not found: " + name));
    }

    public ProductEntity create(ProductDTO product) throws ProductAlreadyExistsException {
        if (repository.findByName(product.getName()).isPresent()) {
            throw new ProductAlreadyExistsException("Product already exists: " + product.getName());
        }
        ProductEntity entity = new ProductEntity();
        entity.setName(product.getName());
        entity.setDescription(product.getDescription());
        entity.setPrice(product.getPrice());
        return repository.save(entity);
    }

    public void delete(String id) throws ProductNotFoundException {
        if (!repository.existsById(id)) {
            throw new ProductNotFoundException("Product not found: " + id);
        }
        repository.deleteById(id);
    }

}
