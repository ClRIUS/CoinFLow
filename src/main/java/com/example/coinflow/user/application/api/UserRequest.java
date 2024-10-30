package com.example.coinflow.user.application.api;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Value;

@Value
public class UserRequest {
    @NotBlank
    private String name;
    @NotBlank
    @Email
    private String email;
    @NotEmpty
    @Size(min = 4)
    private String password;
}
