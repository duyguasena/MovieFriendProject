package com.example.MovieFriend.repository;

import com.example.MovieFriend.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie,Long > {
}
