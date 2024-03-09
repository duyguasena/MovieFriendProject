package com.example.MovieFriend.service;

import com.example.MovieFriend.model.User;
import com.example.MovieFriend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public List<User> allUser() {
        return userRepository.findAll();

    }

    public String updateFirstName(Long id, User user) {
        Optional<User> userOptional=userRepository.findById(id);
        if(userOptional.isPresent()){
            User oldUser=userOptional.get();
            oldUser.setPassword(user.getPassword());
            userRepository.save(oldUser);
            return "Success";
        }

        return null;
    }

    public String deleteUserById(Long id) {
        userRepository.deleteById(id);
        return "Success";
    }
}
