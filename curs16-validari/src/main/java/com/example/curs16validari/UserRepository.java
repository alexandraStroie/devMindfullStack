package com.example.curs16validari;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    private List<User> registeredUsers = new ArrayList<>();

    public void registerUser(User user) {
        registeredUsers.add(user);
    }

    public void isUserRegisterd(User user) {
        if (registeredUsers.contains(user)) {

        }
    }
}
