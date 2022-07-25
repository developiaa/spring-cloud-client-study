package pro.developia.userservice.service;

import pro.developia.userservice.dto.UserDto;

public interface UserService {
    UserDto createUser(UserDto userDto);
}
