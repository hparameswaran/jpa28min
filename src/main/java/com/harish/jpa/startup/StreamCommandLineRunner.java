package com.harish.jpa.startup;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.harish.jpa.entity.User;

@Component
public class StreamCommandLineRunner implements CommandLineRunner{
	
	private static final Logger logger = LoggerFactory.getLogger(StreamCommandLineRunner.class);
	 @Override
	    public void run(String...args) throws Exception {

	        logger.info("StreamCommandLineRunner ----------------------");
	        List<String> myList =
	        	    Arrays.asList("a1", "a2", "b1", "c2", "c1");

	        	myList
	        	    .stream()
	        	    .filter(s -> s.startsWith("c"))
	        	    .map(String::toUpperCase)
	        	    .sorted()
	        	    .forEach(logger::info);
	        logger.info(myList.toString());
	        logger.info("StreamCommandLineRunner ----------------------------");
	        
	    }
	
	
}
