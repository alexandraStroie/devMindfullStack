package com.example.curs16validari;

import com.example.curs16validari.exceptions.UserAlreadyExistException;
import com.example.curs16validari.exceptions.UserNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User isUserRegistered(String email, String password) {
        Optional<User> user = userRepository.getAllRegisteredUsers()
                .stream()
                .filter(userReg -> userReg.getEmail().equalsIgnoreCase(email)
                && userReg.getPassword().equalsIgnoreCase(password))
                .findFirst();

        if(user.isEmpty()) {
            throw new UserNotFoundException("User not found: " + email);
        }

        return user.get();
    }

    public void registerUser(User user) {
        if(userRepository.isUserRegistered(user)) {
            throw new UserAlreadyExistException("User is already registered with email address:" + user.getEmail());
        }
        userRepository.registerUser(user);
    }


    public User loginUser(LoginRequest loginRequest) {
        User userRegistered = isUserRegistered(loginRequest.getEmail(), loginRequest.getPassword());
        userRepository.loginUser(userRegistered);
        return userRegistered;
    }


    public boolean isUserLoggedIn(String email) {
        return userRepository.getAllLoggedInUsers()
                .stream()
                .anyMatch(user -> user.getEmail().equalsIgnoreCase(email));
    }

    public User findLoggedInUserByEmail(String email){
        Optional<User> userLoggedIn = userRepository.getAllLoggedInUsers()
                .stream()
                .filter(user -> user.getEmail().equals(email))
                .findFirst();

        return userLoggedIn.get();
    }
}
