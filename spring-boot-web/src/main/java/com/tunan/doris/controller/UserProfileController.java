package com.tunan.doris.controller;


import com.tunan.doris.dao.UserProfileRepository;
import com.tunan.doris.domain.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserProfileController {


    @Autowired
    UserProfileRepository userProfileRepository;


    @GetMapping("/getUser/{id}")
    public UserProfile getUserById(@PathVariable("id") String userid) {
        return userProfileRepository.findById(userid).get();
    }

    @PostMapping("/saveUser")
    public UserProfile saveUser(UserProfile userProfile) {
        return userProfileRepository.save(userProfile);
    }
}
