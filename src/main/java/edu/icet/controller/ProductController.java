package edu.icet.controller;

import edu.icet.dto.Customer;
import edu.icet.dto.Product;
import edu.icet.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin
@RequestMapping("/product")
public class ProductController {

    final ProductService productService;

    @PostMapping("/add-product")
    @ResponseStatus(HttpStatus.CREATED)
    public void addProduct(@RequestBody Product product) {
        productService.addProduct(product);
    }

    @GetMapping("/get-all-products")
    public List<Product> getProduct() {
        return productService.getProduct();
    }

    @DeleteMapping("delete-by-id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteById(@PathVariable Integer id){
        productService.deleteById(id);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.OK)
    public void updateProduct(@RequestBody Product product){
        productService.addProduct(product);
    }

    @GetMapping("/search-by-name/{name}")
    public List<Product> searchByName(@PathVariable String name){
        return productService.searchByName(name);
    }

    @GetMapping("/search-by-category/{category}")
    public List<Product> searchByCategory(@PathVariable String category){
        return productService.searchByCategory(category);
    }

}
