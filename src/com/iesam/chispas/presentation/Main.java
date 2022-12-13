package com.iesam.chispas.presentation;

import com.iesam.chispas.data.CustomerDataStore;
import com.iesam.chispas.data.MemCustomerDataStore;
import com.iesam.chispas.domain.models.*;
import com.iesam.chispas.domain.usecase.AddCustomerUseCase;
import com.iesam.chispas.domain.usecase.DeleteCustomerUseCase;
import com.iesam.chispas.domain.usecase.GetCustomerUseCase;

import java.util.List;

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



        printAutonomous(autonomous);
        printSocieties(societies);



    }

    public static void printAutonomous(Autonomous autonomous) {
        System.out.println("codi:" + autonomous.getIdClient() + " Nombre:" + autonomous.getName());
    }


    public static void printSocieties(Societies societies) {
                System.out.println("codi:" +societies.getIdClient() + " Nombre: " + societies.getName());
    }


    public static void printUser(User user) {
        System.out.println("codi:" + user.getIdClient() + " Nombre:" + user.getName());
    }

/**
    CustomerDataStore customerDataStore = new MemCustomerDataStore();

        AddCustomerUseCase addCustomerUseCase = new AddCustomerUseCase(customerDataStore);
      AddCustomerUseCase.execute(autonomous);
      AddCustomerUseCase.execute(societies);

       GetCustomerUseCase getCustomerUseCase = new GetCustomerUseCase(customerDataStore);
       List<User> customers = getCustomerUseCase.execute();
       for (int i = 0; i < customers.size(); i++) {
           printUser(customers.get(i));
    }


       DeleteCustomerUseCase deleteCustomerUseCase = new DeleteCustomerUseCase(customerDataStore);
       deleteCustomerUseCase.execute()
       List<User> customers = getCustomerUseCase.execute();
       for (int i = 0; i < customers.size(); i++) {
           printUser(customers.get(i));

    }
*/
}