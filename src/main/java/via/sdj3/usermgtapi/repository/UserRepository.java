package via.sdj3.usermgtapi.repository;

import org.springframework.data.repository.CrudRepository;
import via.sdj3.usermgtapi.model.User;

import java.util.Optional;

/**
 * @author JOOK
 */
public interface UserRepository extends CrudRepository<User, Integer> {
    // Additional query to find a user by email just for testing
    Optional<User> findByEmail(String email);
}
