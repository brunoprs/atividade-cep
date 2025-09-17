package com.example.crud.service;

import com.example.crud.domain.product.Product;
import com.example.crud.domain.product.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CepService cepService;

    public boolean verificaCidadeCep(String cep, String id) {
        Product product = productRepository.findById(id).orElse(null);
        if (product == null) {
            return false;
        }
        String cidadeCep = cepService.getCidadeByCep(cep);
        if (cidadeCep == null) {
            return false;
        }
        return cidadeCep.equalsIgnoreCase(product.getDistributionCenter());
    }
}