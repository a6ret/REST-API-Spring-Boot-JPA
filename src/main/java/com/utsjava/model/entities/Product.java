package com.utsjava.model.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_product")
public class Product implements Serializable {
    // mendeklarasikan primary key untuk tbl_product nantinya
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // mengcustom nama kolom dari tbl_product
    @Column(name = "product_name", length = 100, nullable = false)
    private String name;

    @Column(name = "product_desc", length = 500, nullable = false)
    private String description;

    @Column(nullable = false)
    private double price;

    @OneToOne(mappedBy = "product")
    private Invoice invoice;

    public Product() {
    }

    public Product(Long id, String name, String description, double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
