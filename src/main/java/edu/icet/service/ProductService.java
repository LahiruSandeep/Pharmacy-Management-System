package edu.icet.service;

import edu.icet.dto.Product;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface ProductService {
    void addProduct(Product product);

    List<Product> getProduct();

    void deleteById(Integer productId);

    List<Product> searchByName(String name);

    List<Product> searchByCategory(String category);
}