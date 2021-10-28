package com.signup.SignUpApi.Service;

import com.signup.SignUpApi.Entity.User;
import com.signup.SignUpApi.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SignUpService {
    @Autowired
    private UserRepository repository;

    public void add(User user)
    {
        repository.save(user);
    }
    public List<User> getAll(){
        List<User> users= new ArrayList<User>();
        repository.findAll().forEach(users::add);
        return users;
    }
    public Optional<User> getOne(Integer id)
    {

        return repository.findById(id);
    }
}
