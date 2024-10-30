package com.example.coinflow.user.application.service;

import com.example.coinflow.user.application.api.UserRequest;
import com.example.coinflow.user.application.api.UserResponse;

public interface UserService {
    UserResponse createUser(UserRequest userRequest);
}
