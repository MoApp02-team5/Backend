package com.example.termproject.util;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApiResponse<T> {
    private boolean success;
    private T data;
    private String message;

    // 성공 응답을 위한 정적 메서드
    public static <T> ApiResponse<T> success(T data) {
        return new ApiResponse<>(true, data, "Operation successful");
    }

    // 실패 응답을 위한 정적 메서드
    public static <T> ApiResponse<T> failure(String message) {
        return new ApiResponse<>(false, null, message);
    }
}
