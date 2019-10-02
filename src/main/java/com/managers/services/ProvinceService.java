package com.managers.services;

import com.managers.models.Province;

public interface ProvinceService {
    Iterable<Province> findAll();

    Province findById(Long id);

    void save(Province province);

    void delete(Long id);
}
