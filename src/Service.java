public class Service implements Foots {

    private Integer idServ;
    public String name;
    public String brand;
    public String vatRate;


    public Integer getIdServ() {
        return idServ;
    }

    @Override
    public Integer getName() {
        return null;
    }

    @Override
    public Integer getBrand() {
        return null;
    }

    @Override
    public String getVatRate() {
        return null;
    }

    public void setIdServ(Integer idServ) {
        this.idServ = idServ;
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
