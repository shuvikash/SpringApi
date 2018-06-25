package co.interleap.api.repositories;

import co.interleap.api.models.User;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
