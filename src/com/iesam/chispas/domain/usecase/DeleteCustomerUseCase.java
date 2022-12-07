package com.iesam.chispas.domain.usecase;

import com.iesam.chispas.data.CustomerDataStore;
import com.iesam.chispas.domain.models.User;

public class DeleteCustomerUseCase {

    /*
     *Propiedades/atributos
     */
    private CustomerDataStore customerDataStore;


    public DeleteCustomerUseCase(CustomerDataStore customerDataStore) {

        this.customerDataStore = customerDataStore;
    }

    /*
    / metodo
     */

    public void execute(User user){
        customerDataStore.deleteCustomer(user);
    }

}
