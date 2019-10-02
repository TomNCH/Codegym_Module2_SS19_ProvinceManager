package com.managers.services;

import com.managers.models.Customer;
import com.managers.models.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface CustomerService {
    Page<Customer> findAll(Pageable pageable);

    Customer findByID(Long id);

    void save (Customer customer);

    void remote(Long id);

    Iterable<Customer> findAllByProvince(Province province);

    Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable);
}
