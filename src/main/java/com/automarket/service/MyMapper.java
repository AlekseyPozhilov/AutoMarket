package com.automarket.service;

import com.automarket.data.dto.car.CarDto;
import com.automarket.data.dto.user.UserDto;
import com.automarket.data.entity.CarEntity;
import com.automarket.data.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface MyMapper {
    MyMapper INSTANCE = Mappers.getMapper(MyMapper.class);

    CarEntity toCarEntity(CarDto dto);

    CarDto toCarDto(CarEntity entity);

    UserEntity toUserEntity(UserDto dto);

    UserDto toUserDto(UserEntity entity);
}
