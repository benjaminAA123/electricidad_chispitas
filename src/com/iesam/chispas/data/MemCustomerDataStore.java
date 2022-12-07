package com.iesam.chispas.data;


import com.iesam.chispas.domain.models.User;
import com.sun.security.ntlm.Client;

import java.util.List;

public class MemCustomerDataStore implements CustomerDataStore{

  private TreeMap<Integer, User> DataStore = new TreeMap<>();


  @Override
  public void saveCustomer(User user) {

  }

  @Override
  public void deleteCustomer(User user) {
  dataStore.remove(User.getIdClient());
  }

  @Override
  public void updateCustomer(User user) {

  }

  @Override
  public List<User> getAllCustomers() {
    return null;
  }

  @Override
  public User findById(Integer idClient) {
    return null;
  }
}
