package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product {
    private Integer productId;
    private String name;
    private Double price;
    private Integer supplierId;
    private String description;
    private String category;
    private Double rating;
}
