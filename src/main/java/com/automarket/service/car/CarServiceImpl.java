package com.automarket.service.car;

import com.automarket.data.dto.car.CarDto;
import com.automarket.data.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarServiceImpl implements CarService{
    private final CarRepository carRepository;

    @Override
    public List<CarDto> findAll() {
        return null;
    }

    @Override
    public CarDto findById(Long id) {
        return null;
    }

    @Override
    public CarDto create(CarDto dto) {
        return null;
    }

    @Override
    public CarDto update(CarDto dto) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
