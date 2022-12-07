package com.iesam.chispas.domain.models;

public class Product implements Foots {
    private Integer idProduct;
    public String name;
    public String brand;
    public String model;
    public String price;
    public String vatRate;


    @Override
    public String getBrand() {
        return this.brand;
    }

    @Override
    public String getVatRate() {
        return this.vatRate;
    }


    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setVatRate(String vatRate) {
        this.vatRate = vatRate;
    }
}