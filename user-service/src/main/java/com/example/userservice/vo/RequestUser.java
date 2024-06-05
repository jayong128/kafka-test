package com.example.userservice.vo;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RequestUser {
    @NotNull(message = "Email cannot ne null")
    @Size(min = 2, message = "Email not ne less than two characters")
    @Email
    private String email;

    @NotNull(message = "Name cannot ne null")
    @Size(min = 2, message = "name not ne less than two characters")
    private String name;

    @NotNull(message = "Pwd cannot ne null")
    @Size(min = 8, message = "Pwd not ne less than two characters")
    private String pwd;
}
