package com.iesam.chispas.domain.models;

public class Autonomous implements User {
    /**
     * Clase  autonomos
     */

    private Integer idClient;
    private Integer phone;
    public String name;
    public String surname;
    public String dni;
    public String postal;
    public String population;
    public String province;
    public String email;



    @Override
    public Integer getIdClient() {
        return this.idClient;
    }

    @Override
    public Integer getPhone() {
        return this.phone;
    }

    @Override
    public String getName() {
        return this.name + "" + this.surname;
    }

    @Override
    public String getPostal() {
        return this.postal;
    }

    @Override
    public String getPopulation() {
        return this.population;
    }

    @Override
    public String getProvince() {
        return this.province;
    }

    @Override
    public String getEmail() {
        return this.email;
    }





    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}


