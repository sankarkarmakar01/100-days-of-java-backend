package com.example.first.services;

import com.example.first.entity.User;
import com.example.first.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public User updateUser(Long id, User user) {
        return userRepository.findById(id)
        .map(existingUser->{
            existingUser.setName(user.getName());
            existingUser.setEmail(user.getEmail());
            return userRepository.save(existingUser);
        }).orElseThrow(()->new RuntimeException("User not found"));
    }

    public String deleteUser(Long id) {
        if(id == null) {
            return "User Id not found";
        }
        userRepository.deleteById(id);
        return "User Deleted";
    }
}
