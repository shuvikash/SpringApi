package hello;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    private final AtomicInteger  counter = new AtomicInteger();
    private List<User> users = new ArrayList<User>();

    @RequestMapping(method=RequestMethod.GET , path="/users")
    public List<User> getUser()
    {
        return users;
    }
   @RequestMapping(method=RequestMethod.POST , path="/users")
    public User postUser(@RequestBody User user){
        User temp=new User(counter.incrementAndGet(),user.getUserName() );
       users.add(temp);
       return temp;
    }

}