package com.iesam.chispas.domain.usecase;

import com.iesam.chispas.data.CustomerDataStore;
import com.iesam.chispas.domain.models.User;
import com.sun.deploy.util.SessionState;

import java.util.List;

public class GetCustomerUseCase {

    private CustomerDataStore customerDataStore;

    public GetCustomerUseCase(CustomerDataStore customerDataStore) {
        this.customerDataStore = customerDataStore;
    }

    public List<User> execute(){
        return customerDataStore.getAllCustomers();
    }



}
