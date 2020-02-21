package com.in28minutes.learning.jpa.jpain10steps;

import com.in28minutes.learning.jpa.jpain10steps.entity.User;
import com.in28minutes.learning.jpa.jpain10steps.service.UserDAOService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserRepositoryServiceCommandLineRunner implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(UserRepositoryServiceCommandLineRunner.class);
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        User user = new User("Minh Tan", "IT");
        repository.save(user);
        logger.info("New user is created: " + user);
        user.setName("Minh Tu");
        repository.save(user);
        logger.info("A user is edited: " + user);
    }
}


