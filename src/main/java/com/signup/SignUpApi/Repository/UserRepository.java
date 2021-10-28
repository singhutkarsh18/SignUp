package com.signup.SignUpApi.Repository;

import com.signup.SignUpApi.Entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {

}
