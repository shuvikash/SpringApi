package api.spring.controllers;

import api.spring.repositories.UserRepository;
import api.spring.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {
        @Autowired
        UserRepository repository;

        @RequestMapping(method=RequestMethod.POST , path="/login")
        @CrossOrigin(origins = "http://localhost:8080")
        public String checkUser(@RequestBody User user)
        {
            User userEmail= repository.findByEmail(user.getEmail());
            User userPassword= repository.findByPassword(user.getPassword());
            if(userEmail !=null && userPassword !=null)
                return "ok";
            else
                return "error";
        }
}
