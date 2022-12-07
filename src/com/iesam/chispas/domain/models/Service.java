package com.iesam.chispas.domain.models;

public class Service implements Foots {

    private Integer idServ;
    public String name;
    public String brand;
    public String vatRate;


    @Override
    public String getBrand() {
        return this.brand;
    }

    @Override
    public String getVatRate() {
        return this.vatRate;
    }


    public Integer getIdServ() {
        return idServ;
    }

    public void setIdServ(Integer idServ) {
        this.idServ = idServ;
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

    public void setVatRate(String vatRate) {
        this.vatRate = vatRate;
    }
}
