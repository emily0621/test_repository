package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfiguration {
    private UserService userService;

    @Autowired
    public UserConfiguration(UserService userService) {
        this.userService = userService;
    }

    @Bean
    public void fillInDatabase(){
        userService.save(new User("name1"));
        userService.save(new User("name2"));
        userService.save(new User("name3"));
    }
}
