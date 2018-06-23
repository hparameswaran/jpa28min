package com.harish.jpa.startup;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.harish.jpa.dao.UserDAOService;
import com.harish.jpa.entity.User;

@Component
public class UserDAOServiceCommandLineRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(UserDAOServiceCommandLineRunner.class);
    
    @Autowired
    private UserDAOService userDaoService;
    
    @Override
    public void run(String...args) throws Exception {

        logger.info("UserDAOServiceCommandLineRunner going to insert startup database configs");
        User user = new User("Mary" , "Admin");
        long insert = userDaoService.insert(user);
        logger.info("New User is created : " + user + " id:" + insert);
        
    }

}