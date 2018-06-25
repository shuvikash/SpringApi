package co.interleap.api;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    UserRepository repository;
    private final AtomicInteger  counter = new AtomicInteger();
    private List<User> users = new ArrayList<User>();

    @RequestMapping(method=RequestMethod.GET , path="/users")
    @CrossOrigin(origins = "http://localhost:8080")
    public Iterable getUser()
    {
        return repository.findAll();

    }
   @RequestMapping(method=RequestMethod.POST , path="/users")
   @CrossOrigin(origins = "http://localhost:8080")
    public String postUser(@RequestBody User user){
       repository.save(user);
       // User temp=new User(counter.incrementAndGet(),user.getUserName() );
       //users.add(temp);
       //return temp;
       return "ok";
    }

}