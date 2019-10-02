package com.managers.services.impl;

import com.managers.models.Customer;
import com.managers.models.Province;
import com.managers.repositories.CustomerReporitory;
import com.managers.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerReporitory customerReporitory;

    @Override
    public Iterable<Customer> findAll() {
        return customerReporitory.findAll();
    }

    @Override
    public Customer findByID(Long id) {
        return customerReporitory.findOne(id);
    }

    @Override
    public void save(Customer customer) {
        customerReporitory.save(customer);
    }

    @Override
    public void remote(Long id) {
        customerReporitory.delete(id);
    }

    @Override
    public Iterable<Customer> findAllByProvince(Province province) {
        return customerReporitory.findAllByProvince(province);
    }


}
