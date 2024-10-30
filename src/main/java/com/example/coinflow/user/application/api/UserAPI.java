package com.example.coinflow.user.application.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/user")
public interface UserAPI {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    UserResponse postUser(@Valid @RequestBody UserRequest userRequest);
}
