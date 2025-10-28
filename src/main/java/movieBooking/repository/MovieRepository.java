package movieBooking.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.stereotype.Repository;

import movieBooking.model.Genre;
import movieBooking.model.Movie;
import movieBooking.model.Rating;

@Repository
public class MovieRepository {
    private final Map<Long, Movie> movieMap = new HashMap<>();

    public void save(Movie movie) {
        movieMap.put(movie.getId(), movie);
    }

    public List<Movie> findAll() {
        return new ArrayList<>(movieMap.values());
    }
    // Initialize 100 movies here
    public void loadMovies() {
        List<Genre> genres = Arrays.asList(Genre.values());
        List<Rating> ratings = Arrays.asList(Rating.values());
        Random random = new Random();

        for (long id = 1; id <= 100; id++) {
            Movie movie = new Movie();
            movie.setId(id);
            movie.setTitle("Movie " + id);
            movie.setGenre(genres.get(random.nextInt(genres.size())));
            movie.setRating(ratings.get(random.nextInt(ratings.size())));
            save(movie);
        }
    }
}