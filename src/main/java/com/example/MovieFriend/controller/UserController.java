package com.example.MovieFriend.controller;


import com.example.MovieFriend.model.User;
import com.example.MovieFriend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping()
    public User addUser(@RequestBody User user){
        return userService.saveUser(user);
    }
    @GetMapping
    public List<User> allUser(){
        return userService.allUser();
    }
    @PutMapping("{id}")
    public String updatePassword(@PathVariable Long id,@RequestBody User user){
       return userService.updateFirstName( id, user);
    }
    @DeleteMapping("{id}")
    public void deleteUserById(@PathVariable Long id){
        userService.deleteUserById(id);
    }
}
