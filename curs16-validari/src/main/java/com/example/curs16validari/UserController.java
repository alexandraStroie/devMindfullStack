package com.example.curs16validari;

import com.example.curs16validari.exceptions.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

//@RestController
public class UserController {

    private UserService userService;

    @PostMapping("/register")
    public User handleRegister(@Valid @RequestBody User user) {
        userService.registerUser(user);
        return user;
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> handleLogin(@Valid @RequestBody LoginRequest loginRequest) {
        String email = loginRequest.getEmail();
        boolean isUserLoggedIn = userService.isUserLoggedIn(email);

        if(isUserLoggedIn) {
            return ResponseEntity.accepted()
                    .body(LoginResponse.loggRespOf(userService.findLoggedInUserByEmail(email)));
        }

        User user = userService.loginUser(loginRequest);

        return ResponseEntity.ok().body(LoginResponse.loggRespOf(user));
    }


    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleValidationExceptions(MethodArgumentNotValidException exceptions) {
        Map<String, String> errors = new HashMap<>();

        exceptions.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });

        return errors;
    }



    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(IllegalStateException.class)
    public String handleUserNotUniqueException(IllegalStateException ex) {
        return ex.getMessage();
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(UserNotFoundException.class)
    public String handleUserNotFoundException(UserNotFoundException ex) {
        return ex.getMessage();
    }
}
