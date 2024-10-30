package com.example.coinflow.user.application.service;

import com.example.coinflow.user.application.api.UserRequest;
import com.example.coinflow.user.application.api.UserResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class UserServiceApplication implements UserService{

    @Override
    public UserResponse createUser(UserRequest userRequest) {
        log.info("[Start] UserServiceApplication - createUser");
        log.info("[Finish] UserServiceApplication - createUser");
        return null;
    }
}
