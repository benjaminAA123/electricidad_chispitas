package com.iesam.chispas.data;

import com.iesam.chispas.domain.models.User;

import java.util.List;

public interface ItemDataStore {

    void saveCustomer(User user);
    void deleteCustomer(User user);
    void updateCustomer(User user);
    List<User> getAllCustomers();
    User findById(Integer idClient);


}
