package com.example.MovieFriend.repository;

import com.example.MovieFriend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
