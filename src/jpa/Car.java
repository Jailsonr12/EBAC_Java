package com.example.demo.domain;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_car")
    private Long id;

    @Column(name = "model", nullable = false, length = 100)
    private String model;

    @Column(name = "year", nullable = false)
    private Integer year;

    // Muitos Carros para uma Marca (ManyToOne)
    @ManyToOne
    @JoinColumn(name = "id_brand", nullable = false)
    private Brand brand;

    // Muitos Carros para muitos Acessórios (ManyToMany)
    @ManyToMany
    @JoinTable(
            name = "car_accessory",
            joinColumns = @JoinColumn(name = "id_car"),
            inverseJoinColumns = @JoinColumn(name = "id_accessory")
    )
    private Set<Accessory> accessories = new HashSet<>();

    public Car() {
    }

    public Car(String model, Integer year, Brand brand) {
        this.model = model;
        this.year = year;
        this.brand = brand;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Set<Accessory> getAccessories() {
        return accessories;
    }

    public void setAccessories(Set<Accessory> accessories) {
        this.accessories = accessories;
    }
}
