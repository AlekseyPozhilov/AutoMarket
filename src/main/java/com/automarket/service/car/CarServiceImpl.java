package com.automarket.service.car;

import com.automarket.data.dto.car.CarDto;
import com.automarket.data.entity.CarEntity;
import com.automarket.data.repository.CarRepository;
import com.automarket.service.MyMapper;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CarServiceImpl implements CarService{
    private final CarRepository carRepository;
    private final MyMapper myMapper;

    @Override
    public List<CarDto> findAll() {
        return carRepository.findAll()
                .stream()
                .map(myMapper::toCarDto)
                .collect(Collectors.toList());
    }

    @Override
    public CarDto findById(Long id) {
        Optional<CarEntity> carEntity = carRepository.findById(id);
        return carEntity.map(myMapper::toCarDto)
                .orElseThrow(() -> new EntityNotFoundException("Car not found with id: " + id));
    }

    @Override
    public CarDto create(CarDto dto) {
        CarEntity carEntity = myMapper.toCarEntity(dto);
        CarEntity savedEntity = carRepository.save(carEntity);
        return myMapper.toCarDto(savedEntity);
    }

    @Override
    public CarDto update(CarDto dto) {
        if (dto.getId() == null) {
            throw new IllegalArgumentException("Car ID must not be null for update");
        }

        Optional<CarEntity> optionalCarEntity = carRepository.findById(dto.getId());
        if (optionalCarEntity.isPresent()) {
            CarEntity carEntity = optionalCarEntity.get();

            carEntity.setBrand(dto.getBrand()); // Обновляем поля из dto
            carEntity.setModel(dto.getModel());
            carEntity.setYearOfPublishing(dto.getYearOfPublishing());
            carEntity.setCountryOfOrigin(dto.getCountryOfOrigin());
            carEntity.setHorsePower(dto.getHorsePower());
            carEntity.setColor(dto.getColor());
            carEntity.setPrice(dto.getPrice());

            CarEntity updatedEntity = carRepository.save(carEntity);
            return myMapper.toCarDto(updatedEntity);
        } else {
            throw new RuntimeException("Car not found");
        }
    }

    @Override
    public void delete(Long id) {
        if (!carRepository.existsById(id)) {
            throw new EntityNotFoundException("Car not found with id: " + id);
        }
        carRepository.deleteById(id);
    }
}
