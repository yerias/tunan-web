package com.tunan.aspectj.controller;


import com.tunan.aspectj.dao.UserRepository;
import com.tunan.aspectj.domain.User;
import com.tunan.aspectj.server.AspectJServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TransactionalController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AspectJServer aspectJServer;

    @PostMapping("/saveUser")
    public String saveUser(User user){
        aspectJServer.save(user);
        return "11111111111";
    }

    @GetMapping("/getUser/{id}")
    public User getUser(@PathVariable("id") Integer id){
        return userRepository.findById(id).get();
    }

}
