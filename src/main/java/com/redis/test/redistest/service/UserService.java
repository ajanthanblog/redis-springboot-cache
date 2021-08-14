package com.redis.test.redistest.service;

import com.redis.test.redistest.model.User;

public interface UserService {
    User saveUser(User user);
    User findUser(String name);
}
