package com.harish.jpa.business;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harish.jpa.dao.UserDAOService;
import com.harish.jpa.dao.UserRepository;
import com.harish.jpa.entity.User;


@Service
public class Business1 {
	
	 private static final Logger logger = LoggerFactory.getLogger(Business1.class);
	
	 @Autowired
     private UserDAOService userDaoService;
	 @Autowired
	 private UserRepository userRepository;
    
     public String doSomeThing(){
       
        
        User user = new User("Joshua" , "noc");
        long insert = userDaoService.insert(user);
        logger.info("New User is created : " + user + " id:" + insert);
        
        Optional<User> userWithIdOne = userRepository.findById(1L);
        logger.info("User retrieved :" + userWithIdOne);
         
        List<User> allUsers = userRepository.findAll();
        logger.info("All users :" + allUsers);
        
        return allUsers.toString();
        
     }
}
