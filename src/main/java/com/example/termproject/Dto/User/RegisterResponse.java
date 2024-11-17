package com.example.termproject.Dto.User;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RegisterResponse {
    private String name;
    private String email;
    private String password;

    public RegisterResponse(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }
}
