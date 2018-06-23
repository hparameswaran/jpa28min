package com.harish.jpa.startup;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.harish.jpa.dao.UserRepository;
import com.harish.jpa.entity.User;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);
    
    @Autowired
    private UserRepository userRepository;
    
    @Override
    public void run(String...args) throws Exception {

        logger.info("UserDAOServiceCommandLineRunner going to insert startup database configs");
        User user = new User("James" , "Developer");
        userRepository.save(user);
        logger.info("New User is created : " + user);
        
        Optional<User> userWithIdOne = userRepository.findById(1L);
        logger.info("User retrieved :" + userWithIdOne);
         
        List<User> allUsers = userRepository.findAll();
        logger.info("All users :" + allUsers);
        
        
    }

}