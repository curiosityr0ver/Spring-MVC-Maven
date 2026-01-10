package com.example.springmvcmaven.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.Instant;

@Entity
@Getter @Setter @NoArgsConstructor @ToString
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String oem;
    private String place;
    private Instant warranty;

    public Product(String name, String oem, String place) {
        this.name = name;
        this.oem = oem;
        this.place = place;
        this.warranty = Instant.now();
    }

    public static void main(String[] args) {


        Product p1 = new Product("Vivobook","Asus", "Patna");
        System.out.println(p1);
    }
}
