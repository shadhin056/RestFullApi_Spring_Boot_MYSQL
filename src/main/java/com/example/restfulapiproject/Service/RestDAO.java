package com.example.restfulapiproject.Service;

import com.example.restfulapiproject.Model.User;
import com.example.restfulapiproject.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RestDAO {
    @Autowired
    UserRepository userRepository;
    //save in db
    public User save(User user){
        return userRepository.save(user);
    }
    //get users
    public List<User>findAll(){
        return userRepository.findAll();
    }
}
