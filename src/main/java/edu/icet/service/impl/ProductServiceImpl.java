package edu.icet.service.impl;

import edu.icet.dto.Product;
import edu.icet.entity.ProductEntity;
import edu.icet.repository.ProductRepository;
import edu.icet.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    final ProductRepository repository;
    final ModelMapper mapper;

    @Override
    public void addProduct(Product product){
        repository.save(mapper.map(product, ProductEntity.class));
    }

    @Override
    public List<Product> getProduct() {
        List<Product> productList = new ArrayList<>();
        repository.findAll().forEach(product -> productList.add(mapper.map(product, Product.class)));
        return productList;
    }

    @Override
    public void deleteById(Integer productId) {
        repository.deleteById(productId);
    }

    @Override
    public List<Product> searchByName(String name) {
        List<Product> productList = new ArrayList<>();
        repository.findByName(name).forEach(entity -> productList.add(mapper.map(entity, Product.class)));
        return productList;
    }

    @Override
    public List<Product> searchByCategory(String category) {
        List<Product> productList = new ArrayList<>();
        repository.findByCategory(category).forEach(entity -> productList.add(mapper.map(entity, Product.class)));
        return productList;
    }
}
