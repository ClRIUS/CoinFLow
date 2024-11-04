package com.example.coinflow.user.application.service;

import com.example.coinflow.user.application.api.UserRequest;
import com.example.coinflow.user.application.api.UserResponse;
import com.example.coinflow.user.application.repository.UserRepository;
import com.example.coinflow.user.domain.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@RequiredArgsConstructor
public class UserServiceApplication implements UserService{
    private final UserRepository userRepository;

    @Override
    public UserResponse createUser(UserRequest userRequest) {
        log.info("[Start] UserServiceApplication - createUser");
        User user = userRepository.saveUser(new User(userRequest));
        log.info("[Finish] UserServiceApplication - createUser");
        return UserResponse.builder()
                .userId(user.getUserId())
                .build();
    }
}
