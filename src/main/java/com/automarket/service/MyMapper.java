package com.automarket.service;

import com.automarket.data.dto.car.CarDto;
import com.automarket.data.dto.user.UserDto;
import com.automarket.data.entity.CarEntity;
import com.automarket.data.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MyMapper {
    MyMapper INSTANCE = Mappers.getMapper(MyMapper.class);

    CarEntity toEntity(CarDto dto);

    CarDto toDto(CarEntity entity);

    UserEntity toEntity(UserDto dto);

    UserDto toDto(UserEntity entity);
}
