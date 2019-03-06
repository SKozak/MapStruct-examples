package pl.com.skozak.model.entity;

import lombok.Data;

@Data
public class Product {
    private Long id;
    private String name;
    private String details;
}
