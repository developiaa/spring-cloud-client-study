package pro.developia.userservice.service;

import pro.developia.userservice.dto.UserDto;
import pro.developia.userservice.jpa.UserEntity;

public interface UserService {
    UserDto createUser(UserDto userDto);

    UserDto getUserByUserId(String userId);

    Iterable<UserEntity> getUserByAll();
}
