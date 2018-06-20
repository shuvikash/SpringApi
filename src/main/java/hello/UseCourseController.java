package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UseCourseController {
    @Autowired
    UserCourseRepository repository;

    @RequestMapping(method=RequestMethod.POST , path="/usercourses")
    //@CrossOrigin(origins = "http://localhost:8080")
    public String postUserCourse(@RequestBody UserCourse course){
        repository.save(course);
        return "ok";
    }

}
