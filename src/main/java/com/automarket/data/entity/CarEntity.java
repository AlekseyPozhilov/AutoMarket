package com.automarket.data.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
@Table(name = "cars")
public class CarEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "brand")
    private String brand;
    @Column(name = "model")
    private String model;
    @Column(name = "year_of_publishing")
    private Integer yearOfPublishing;
    @Column(name = "country_of_origin")
    private String countryOfOrigin;
    @Column(name = "horse_Power")
    private Integer horsePower;
    @Column(name = "color")
    private String color;
    @Column(name = "price")
    private BigDecimal price;
}
