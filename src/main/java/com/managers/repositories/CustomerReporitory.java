package com.managers.repositories;

import com.managers.models.Customer;
import com.managers.models.Province;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CustomerReporitory extends PagingAndSortingRepository<Customer, Long> {
    Iterable<Customer> findAllByProvince(Province province);
}
