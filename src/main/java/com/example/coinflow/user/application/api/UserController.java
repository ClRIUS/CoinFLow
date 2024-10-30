package com.example.coinflow.user.application.api;

import com.example.coinflow.user.application.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@RequiredArgsConstructor
public class UserController implements UserAPI{
    private final UserService userService;

    @Override
    public UserResponse postUser(UserRequest userRequest) {
        log.info("[Start] UserController - postUser");
        UserResponse userCreated = userService.createUser(userRequest);
        log.info("[Finish] UserController - postUser");
        return userCreated;
    }
}
