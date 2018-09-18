package com.example.restfulapiproject.Controller;

import com.example.restfulapiproject.Model.User;
import com.example.restfulapiproject.Service.RestDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = "/restfulapi")
public class UserController {
    @Autowired
    RestDAO restDAO;

    //save user
    @PostMapping(path = "/users")
    public User createUser(@Valid @RequestBody User user) {
        return restDAO.save(user);
    }
    // get all users
    @GetMapping(path = "/users")
    public List<User> getAlluser() {
        return restDAO.findAll();
    }
}
