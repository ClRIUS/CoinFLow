package com.example.coinflow.user.application.infra;

import com.example.coinflow.user.application.repository.UserRepository;
import com.example.coinflow.user.domain.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Repository
@Log4j2
@RequiredArgsConstructor
public class UserRepositoryInfra implements UserRepository {
    private final UserRepositorySpringJPA userRepositorySpringDataJPA;

    @Override
    public User saveUser(User user) {
        log.info("[Start] UserRepositoryInfra - saveUser");
        userRepositorySpringDataJPA.save(user);
        log.info("[Finish] UserRepositoryInfra - saveUser");
        return user;
    }
}
