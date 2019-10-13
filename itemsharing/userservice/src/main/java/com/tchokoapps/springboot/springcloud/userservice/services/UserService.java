package com.tchokoapps.springboot.springcloud.userservice.services;

import com.tchokoapps.springboot.springcloud.userservice.model.User;
import org.springframework.stereotype.Service;

public interface UserService {
    User createUser(User user);
    User getUserByUsername(String username);
}
