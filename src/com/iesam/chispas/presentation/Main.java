package com.iesam.chispas.presentation;

import com.iesam.chispas.domain.models.Autonomous;
import com.iesam.chispas.domain.models.Product;
import com.iesam.chispas.domain.models.Service;
import com.iesam.chispas.domain.models.Societies;

public class Main {
        public static void main (String[] args){
        Autonomous autonomous = new Autonomous();

        autonomous.setIdClient(1);
        autonomous.setPhone(635289979);
        autonomous.setName("Manolo");
        autonomous.setSurname("Fernandez Alonso");
        autonomous.setDni("45646546P");
        autonomous.setPostal("05015");
        autonomous.setPopulation("Seranillos");
        autonomous.setProvince("Avila");
        autonomous.setEmail("chacho123@gmail.es");


        Societies societies = new Societies();

        societies.setIdClient(2);
        societies.setPhone(546546546);
        societies.setCompanyName("Fosquitos S.L");
        societies.setCif("456465666F");
        societies.setPostal("01667");
        societies.setPopulation("Navas");
        societies.setProvince("Zaragoza");
        societies.setEmail("pepito321@gmail.es");


        Product product = new Product();

        product.setIdProduct(3);
        product.setName("Manzanas");
        product.setBrand("Hacendado");
        product.setModel("fruta");
        product.setPrice("5€");
        product.setVatRate("15%");


        Service service = new Service();

        service.setIdServ(4);
        service.setName("Atencion al cliente");
        service.setBrand("0€");
        service.setVatRate("1%");




    }

    public static void printAutonomous(Autonomous autonomous) {
                System.out.println("codi:" + autonomous.getIdClient() + " Nombre:" + autonomous.getName());
    }

    public static void printSocieties(Societies societies) {
                System.out.println("codi:" +societies.getIdClient() + " Nombre: " + societies.getName());
    }

    /*
  /  public static void printUser(User user) {
                System.out.println("cod:" + user.getIdClient() + "Nombre: " + user.getName());
  /  }
*/

}