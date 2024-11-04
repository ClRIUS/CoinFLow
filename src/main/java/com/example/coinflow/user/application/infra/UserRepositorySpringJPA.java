package com.example.coinflow.user.application.infra;

import com.example.coinflow.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepositorySpringJPA extends JpaRepository<User, UUID> {
}
