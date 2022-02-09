package com.bsale.bsale.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "product")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductModel {
    
    @Id @Column(length = 11, nullable = false, precision = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(length = 255, nullable = true)
    String name;
    
    @Column(length = 255, nullable = true)
    String url_image;
    
    @Column(nullable = true)
    float price;
    
    @Column(length = 11, nullable = true)
    int discount;
    
    @Column(length = 11, nullable = true)
    int category;
}
