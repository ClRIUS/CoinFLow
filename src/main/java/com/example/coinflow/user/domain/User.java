package com.example.coinflow.user.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity(name = "User")
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, unique = true, nullable = false)
    private UUID userId;
    @NotBlank
    private String name;
    @Email
    @Column(unique = true)
    private String email;
    @NotEmpty
    private String password;

    private LocalDateTime createdDateTime;
    private LocalDateTime updatedDateTime;
}
