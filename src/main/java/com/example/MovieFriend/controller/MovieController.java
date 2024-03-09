package com.example.MovieFriend.controller;

import com.example.MovieFriend.model.Movie;
import com.example.MovieFriend.service.MovieService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping("/api/v1/movies")
    @RequiredArgsConstructor
    public class MovieController {
        private final MovieService movieService;

        @PostMapping()
        public Movie addMovie(@RequestBody Movie movie){
            return movieService.saveMovie(movie);
        }
        @GetMapping
        public List<Movie> allMovie(){
            return movieService.allMovie();
        }
        @PutMapping("{id}")
        public String updateMovie(@PathVariable Long id,@RequestBody Movie movie){
            return movieService.updateMovie(id,movie);
        }

        @DeleteMapping("{id}")
        public void deleteMovieById(@PathVariable Long id){
            movieService.deleteMovieById(id);
        }
    }

