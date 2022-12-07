package com.iesam.chispas.domain.usecase;

import com.iesam.chispas.data.CustomerDataStore;

public class UpdateCustomerUserCase {

    private CustomerDataStore customerDataStore;

    public UpdateCustomerUserCase(CustomerDataStore customerDataStore) {
        this.customerDataStore = customerDataStore;
    }
}
