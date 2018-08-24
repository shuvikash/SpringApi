package api.spring.controllers;

import api.spring.repositories.UserRepository;
import api.spring.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    UserRepository repository;

   @RequestMapping(method=RequestMethod.POST , path="/users")
   @CrossOrigin(origins = "http://localhost:8080")
    public String postUser(@RequestBody User user)
   {
       repository.save(user);
       return "ok";
   }
}