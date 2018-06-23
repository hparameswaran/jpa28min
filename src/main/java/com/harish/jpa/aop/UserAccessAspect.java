package com.harish.jpa.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class UserAccessAspect {
	
	
	 private static final Logger logger = LoggerFactory.getLogger(UserAccessAspect.class);

    

    @Before("execution(* com.harish.jpa.business.Business1.*(..))")
    public void before(JoinPoint joinPoint) {

        //Advice

        logger.info(" Check for user access ");

        //logger.info(" Allowed execution for {}", joinPoint);

    }
}
