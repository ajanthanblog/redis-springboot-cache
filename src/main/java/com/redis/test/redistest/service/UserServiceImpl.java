package com.redis.test.redistest.service;

import com.redis.test.redistest.model.User;
import com.redis.test.redistest.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        log.info("User Saved {}", userRepository.save(user).getName());
        return userRepository.save(user);
    }

    @Override
    public User findUser(String name) {
        log.info("Invoking User Service Implementation {}", name);
        return userRepository.findByName(name);
    }
}
