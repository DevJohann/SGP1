package co.rootsoftworks.app.sgp1.sgp1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.rootsoftworks.app.sgp1.sgp1.entity.Product;
import co.rootsoftworks.app.sgp1.sgp1.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository repository;

    @Override
    public List<Product> findAll() {
        return (List<Product>) repository.findAll();
    }

}
