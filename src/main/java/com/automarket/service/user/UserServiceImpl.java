package com.automarket.service.user;

import com.automarket.data.dto.user.UserDto;
import com.automarket.data.entity.UserEntity;
import com.automarket.data.repository.UserRepository;
import com.automarket.service.MyMapper;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Log4j2
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final MyMapper myMapper;

    @Override
    public List<UserDto> findAll() {
        return userRepository.findAll()
                .stream()
                .map(myMapper::toUserDto)
                .collect(Collectors.toList());
    }

    @Override
    public UserDto findById(Long id) {
        Optional<UserEntity> userEntity = userRepository.findById(id);
        return userEntity.map(myMapper::toUserDto).orElseThrow(() -> new EntityNotFoundException("User not found with id: " + id));
    }

    @Override
    public UserDto create(UserDto dto) {
        UserEntity userEntity = myMapper.toUserEntity(dto);
        UserEntity savedEntity = userRepository.save(userEntity);
        return myMapper.toUserDto(savedEntity);
    }

    @Override
    public UserDto update(UserDto dto) {
        // Найдем пользователя по ID
        if (dto.getId() == null) {
            throw new IllegalArgumentException("User ID must not be null for update");
        }

        Optional<UserEntity> optionalUserEntity = userRepository.findById(dto.getId());
        if (optionalUserEntity.isPresent()) {
            UserEntity userEntity = optionalUserEntity.get();

            userEntity.setFirstName(dto.getFirstName());   // Обновляем поля из dto
            userEntity.setLastName(dto.getLastName());
            userEntity.setEmail(dto.getEmail());
            userEntity.setDateOfBirth(dto.getDateOfBirth());
            userEntity.setGender(dto.getGender());
            userEntity.setPhoneNumber(dto.getPhoneNumber());
            userEntity.setPassword(dto.getPassword());

            UserEntity updatedEntity = userRepository.save(userEntity);
            return myMapper.toUserDto(updatedEntity);
        } else {
            throw new RuntimeException("User not founded");
        }
    }

    @Override
    public void delete(Long id) {
        if (!userRepository.existsById(id)) {
            throw new EntityNotFoundException("Car not found with id: " + id);
        }
        userRepository.deleteById(id);
    }
}
