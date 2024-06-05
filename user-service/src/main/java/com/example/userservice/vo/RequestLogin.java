package com.example.userservice.vo;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RequestLogin {
    @NotNull(message = "Email cannot be null")
    @Size(min = 2, message = "Email not be less than 2 char")
    @Email
    private String email;

    @NotNull(message = "Pwd cannot be null")
    @Size(min = 8, message = "Email not be less than 8 char")
    private String password;
}
