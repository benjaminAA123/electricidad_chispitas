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
        return null;
    }

    @Override
    public Integer getPhone() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }



    @Override
    public String getSurname() {
        return null;
    }

    @Override
    public String getDni() {
        return this.dni;
    }


    @Override
    public String getPostal() {
        return null;
    }

    @Override
    public String getPopulation() {
        return null;
    }

    @Override
    public String getProvince() {
        return null;
    }

    @Override
    public String getEmail() {
        return null;
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

    public void setSurname(String surname) {
        this.surname = surname;
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


