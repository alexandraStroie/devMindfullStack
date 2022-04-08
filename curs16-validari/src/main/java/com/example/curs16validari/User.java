package com.example.curs16validari;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @NotNull(message = "firstName must be not-null")
    @NotBlank
    private String firstName;

    @NotNull(message = "lastName must be not-null")
    @NotBlank
    private String lastName;

    @NotNull(message = "email must be not-null")
    @Pattern(regexp = "^[A-Za-z0-9+_.-]+@(.+)$", message = "email must contain @ and .")
    private String email;

    @NotNull(message = "email must be not-null")
    @Pattern(regexp = "^[A-Za-z0-9+_.-]+@(.+)$", message = "email must contain @ and .")
    private String password;
}
