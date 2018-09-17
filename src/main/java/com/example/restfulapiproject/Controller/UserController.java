package com.example.restfulapiproject.Controller;

import com.example.restfulapiproject.Model.User;
import com.example.restfulapiproject.Service.RestDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = "/rest")
public class UserController {
    @Autowired
    RestDAO restDAO;

    //save user
    @PostMapping(path = "/user")
    public User createUser(@Valid @RequestBody User user) {
        return restDAO.save(user);
    }
    // get all users
    @GetMapping(path = "/user")
    public List<User> getAlluser() {
        return restDAO.findAll();
    }
}
