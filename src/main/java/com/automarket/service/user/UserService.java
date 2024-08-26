package com.automarket.service.user;


import com.automarket.data.dto.user.UserDto;

import java.util.List;

public interface UserService {
    List<UserDto> findAll();

    UserDto findById(Long id);

    UserDto create(UserDto dto);

    UserDto update(UserDto dto);

    void delete(Long id);
}
