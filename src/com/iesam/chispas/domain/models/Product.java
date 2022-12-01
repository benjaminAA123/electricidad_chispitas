package com.iesam.chispas.domain.models;

public class Product implements Foots {
    private Integer idProduct;
    public String name;
    public String brand;
    public String model;
    public String price;
    public String vatRate;


    public Integer getIdProduct() {
        return idProduct;
    }

    @Override
    public Integer getName() {
        return null;
    }


    @Override
    public Integer getBrand() {
        return null;
    }

    public String getModel() { return model; }


    public String getPrice() {
        return price;
    }

    @Override
    public String getVatRate() {
        return null;
    }


    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setVatRate(String vatRate) {
        this.vatRate = vatRate;
    }

}