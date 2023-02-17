package com.example.Sql_Rocks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService
{
 @Autowired

    UserRepository userRepository;

    public String createUser(User user)
    {
        userRepository.save(user);

        return "User added Successfully";
    }

    public User getUser(int id)
    {
       User user = userRepository.findById(id).get(); // helps you find entity by primary key
       return user;
    }

}
