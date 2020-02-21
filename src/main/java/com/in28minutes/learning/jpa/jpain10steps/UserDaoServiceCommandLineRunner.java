package com.in28minutes.learning.jpa.jpain10steps;

import com.in28minutes.learning.jpa.jpain10steps.entity.User;
import com.in28minutes.learning.jpa.jpain10steps.service.UserDAOService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);
    @Autowired
    private UserDAOService service;
    @Override
    public void run(String... args) throws Exception {
        User user = new User("Minh Tan", "IT");
        service.insert(user);
        logger.info("New user is created: " + user);
        User user2 = new User("Minh Tan 2", "IT");
        service.insert(user2);
        logger.info("New user is created: " + user2);
    }
}


