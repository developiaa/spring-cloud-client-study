package pro.developia.userservice.repository;

import org.springframework.data.repository.CrudRepository;
import pro.developia.userservice.jpa.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Long> {
}
