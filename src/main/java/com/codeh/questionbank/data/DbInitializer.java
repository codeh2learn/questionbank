package com.codeh.questionbank.data;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class DbInitializer implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(DbInitializer.class);

    @Autowired
    private UserInfoRepository userInfoRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
        logger.info("Inside the DbInitializer");
        userInfoRepository.deleteAll();
        List<UserInfo> userList = new ArrayList<>();
        userList.add(new UserInfo("user1", passwordEncoder.encode("pass1"),"USER"));
        userList.add(new UserInfo("user2", passwordEncoder.encode("pass2"),"USER"));
        userList.add(new UserInfo("admin1", passwordEncoder.encode("admin1"),"ADMIN"));
        userList.add(new UserInfo("admin2", passwordEncoder.encode("admin2"),""));
        userInfoRepository.saveAll(userList);
        logger.info("Successfully inserted records inside user table!");
    }
}
