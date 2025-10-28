package movieBooking.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import movieBooking.model.FilterDetailsRequest;
import movieBooking.model.Genre;
import movieBooking.model.Movie;
import movieBooking.model.Rating;
import movieBooking.service.MovieService;

@RestController
@RequestMapping("/api/movies")
public class MovieController {
    @Autowired
    private MovieService movieService;

    @GetMapping("/search")
    public ResponseEntity<List<Movie>> searchMovieNames(
        @RequestParam Optional<Genre> genre,
        @RequestParam Optional<Rating> rating,
        @RequestParam(defaultValue = "0") int offset,
        @RequestParam(defaultValue = "10") int limit) {

        FilterDetailsRequest filter = new FilterDetailsRequest(genre, rating, offset, limit);
        List<Movie> movies = movieService.getMovies(filter);
        
        return ResponseEntity.ok(movies);
    }
}
