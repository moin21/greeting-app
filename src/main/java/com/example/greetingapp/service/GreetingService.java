package com.example.greetingapp.service;

import com.example.greetingapp.entity.User;
import com.example.greetingapp.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Service Class: GreetingService.
 */
@Service
public class GreetingService {
    @Autowired
    GreetingRepository greetingRepository;

    /**
     * Method for printing String.
     *
     * @return - Hello !!!
     */

    public String sayHelloByName(String firstName, String lastName) {
        return "Hello " + firstName + " " + lastName + "!!!";
    }

    public User sayHello(User user) {
        User newuser = new User(user);
        greetingRepository.save(user);
        return newuser;
    }

    public String sayPostHello(User user) {
        User newUser = new User(user);
        return "Hello " + newUser;
    }

    public Optional<User> sayHelloById(int id) {
        return greetingRepository.findById(id);

    }
    public List<User> sayHelloAll(){
        return greetingRepository.findAll();

    }
    public String deleteById(int id) {
        greetingRepository.deleteById(id);
        return "User by id "+id+" is Deleted";
    }
}

