package co.interleap.api.repositories;

import co.interleap.api.models.UserCourse;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
@Repository
public interface UserCourseRepository extends CrudRepository<UserCourse, Integer> {

}