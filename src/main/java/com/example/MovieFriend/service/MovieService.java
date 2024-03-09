package com.example.MovieFriend.service;

import com.example.MovieFriend.model.Movie;
import com.example.MovieFriend.model.User;
import com.example.MovieFriend.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MovieService {
    private final MovieRepository movieRepository;
    public Movie saveMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    public List<Movie> allMovie() {
        return movieRepository.findAll();
    }
    public String updateMovie(Long id, Movie movie) {
        Optional<Movie> movieOptional=movieRepository.findById(id);
        if(movieOptional.isPresent()){
            Movie oldMovie=movieOptional.get();
            oldMovie.setName(movie.getName());
            oldMovie.setPoint(movie.getPoint());
            movieRepository.save(oldMovie);
            return "Success";
        }

        return null;
    }
    public void deleteMovieById(Long id) {
        movieRepository.deleteById(id);
    }


}
