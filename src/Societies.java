public class Societies implements User {

    private Integer idClient;
    private Integer phone;
    public String companyName;
    public String cif;
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
        return null;
    }


    public String getCompanyName() {
        return companyName;
    }


    public String getCif() {
        return cif;
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

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setCif(String cif) {
        this.cif = cif;
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
