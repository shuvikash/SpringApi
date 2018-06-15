package hello;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CourseController {
    @Autowired
    CourseRepository repository;

    @RequestMapping(method=RequestMethod.GET , path="/courses")
    //@CrossOrigin(origins = "http://localhost:8080")
    public Iterable getCourse()
    {
        return repository.findAll();

    }
    @RequestMapping(method=RequestMethod.POST , path="/courses")
    //@CrossOrigin(origins = "http://localhost:8080")
    public String postCourse(@RequestBody Course course){
        repository.save(course);
        return "ok";
    }

}