package com.harish.jpa;

import com.harish.jpa.business.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.harish.jpa.startup.UserDAOServiceCommandLineRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BusinessAopSpringBootTest {

	private static final Logger logger = LoggerFactory.getLogger(BusinessAopSpringBootTest.class);

    @Autowired
    private Business1 business1;

    

    @Test
    public void invokeAOPStuff() {

    	logger.debug(business1.doSomeThing());

    }

}
