package com.example.curs16validari;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@Repository
public class UserRepository {
    private List<User> registeredUsers = new ArrayList<>();
    private List<User> loggedInUsers = new ArrayList<>();

    public void registerUser(User user) {
        registeredUsers.add(user);
    }

    public boolean isUserRegistered(User user) {
        return registeredUsers.contains(user);
    }

    public void loginUser(User user) {
        loggedInUsers.add(user);
    }

    public List<User> getAllRegisteredUsers() {
        return new ArrayList<>(registeredUsers);
    }

    public List<User> getAllLoggedInUsers() {
        return new ArrayList<>(loggedInUsers);
    }

    public Boolean logout(String email) {
        return loggedInUsers.removeIf(user -> user.getEmail().equalsIgnoreCase(email));
    }
}
