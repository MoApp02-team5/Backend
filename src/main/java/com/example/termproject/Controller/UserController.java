package com.example.termproject.Controller;

import com.example.termproject.Dto.User.LoginRequest;
import com.example.termproject.Dto.User.LoginResponse;
import com.example.termproject.Dto.User.RegisterRequest;
import com.example.termproject.Dto.User.RegisterResponse;
import com.example.termproject.Repository.UserRepository;
import com.example.termproject.util.ApiResponse;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
@Slf4j
public class UserController {

    private final UserRepository userRepository;

    @PostMapping(value = "/register", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "회원가입")
    public ApiResponse<RegisterResponse> register(@Validated @RequestBody RegisterRequest registerRequest) {
        String name = registerRequest.getUsername();
        String email = registerRequest.getEmail();
        String password = registerRequest.getPassword();


        RegisterResponse registerResponse = RegisterResponse.builder()
                .name(name)
                .email(email)
                .password(password)
                .build();
        return ApiResponse.success(registerResponse);
    }

    @GetMapping(value = "/login",produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "로그인")
    public ApiResponse<LoginResponse> login(@RequestBody LoginRequest loginRequest){
        String email = loginRequest.getEmail();
        String password = loginRequest.getPassword();

        LoginResponse loginResponse = LoginResponse.builder()
                .email(email)
                .password(password)
                .build();
        return ApiResponse.success(loginResponse);
    }
}
