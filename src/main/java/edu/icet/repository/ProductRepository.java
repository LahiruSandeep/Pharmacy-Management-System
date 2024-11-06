package edu.icet.repository;

import edu.icet.entity.CustomerEntity;
import edu.icet.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {
    List<ProductEntity> findByName(String name);
    List<ProductEntity> findByCategory(String category);
}