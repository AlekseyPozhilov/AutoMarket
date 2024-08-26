package com.automarket.data.dto.car;


import lombok.Data;

import java.math.BigDecimal;

@Data
public class CarDto {
    private Long id;
    private String brand;
    private String model;
    private Integer yearOfPublishing;
    private String countryOfOrigin;
    private Integer horsePower;
    private String color;
    private BigDecimal price;
}
