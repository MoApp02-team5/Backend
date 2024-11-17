package com.example.termproject.Dto.User;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Builder
@Getter
public class RegisterRequest {
    @NotNull
    private String username;
    @NotNull
    private String email;
    @NotNull
    private String password;
}
