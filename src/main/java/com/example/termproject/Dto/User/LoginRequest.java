package com.example.termproject.Dto.User;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;

@Getter
@Data
public class LoginRequest {
    @NotNull
    private String email;
    @NotNull
    private String password;
}
