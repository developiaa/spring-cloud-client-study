package pro.developia.userservice.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import pro.developia.userservice.dto.UserDto;
import pro.developia.userservice.jpa.UserEntity;

public interface UserService extends UserDetailsService {
    UserDto createUser(UserDto userDto);

    UserDto getUserByUserId(String userId);

    Iterable<UserEntity> getUserByAll();
}
