package co.interleap.api;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
@Repository
public interface UserCourseRepository extends CrudRepository<UserCourse, Integer> {

}