package com.signup.SignUpApi.Controller;

import com.signup.SignUpApi.Entity.User;
import com.signup.SignUpApi.Service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SignUpController {

    @Autowired
    SignUpService service;

    @GetMapping("/allUsers")
    public List<User> getUsers(){
        return service.getAll();
    }
    @PostMapping("/createUser")
    public void createUser(@RequestBody User user)
    {
        service.add(user);
    }

}
