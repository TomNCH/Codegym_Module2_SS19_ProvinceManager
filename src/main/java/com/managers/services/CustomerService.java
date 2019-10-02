package com.managers.services;

import com.managers.models.Customer;
import com.managers.models.Province;


public interface CustomerService {
    Iterable<Customer> findAll();

    Customer findByID(Long id);

    void save (Customer customer);

    void remote(Long id);

    Iterable<Customer> findAllByProvince(Province province);
}
