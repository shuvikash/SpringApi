package co.interleap.api.repositories;

import co.interleap.api.models.Course;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
@Repository
public interface CourseRepository extends CrudRepository<Course, Long> {

}