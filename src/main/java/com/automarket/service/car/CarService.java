package com.automarket.service.car;

import com.automarket.data.dto.car.CarDto;

import java.util.List;

public interface CarService {
    List<CarDto> findAll();

    CarDto findById(Long id);

    CarDto create(CarDto dto);

    CarDto update(CarDto dto);

    void delete(Long id);
}
