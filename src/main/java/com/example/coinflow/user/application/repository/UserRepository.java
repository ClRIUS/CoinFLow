package com.example.coinflow.user.application.repository;

import com.example.coinflow.user.domain.User;

public interface UserRepository {
    User saveUser(User user);
}
