package movieBooking.service.movieFilter;

import java.util.ArrayList;
import java.util.List;

import movieBooking.model.Movie;
import movieBooking.model.Rating;

public class RatingFilter implements FilterMovie{
    private final Rating rating;
    private final FilterMovie nextFilter;

    public RatingFilter(Rating rating, FilterMovie nextFilter) {
        this.rating = rating;
        this.nextFilter = nextFilter;
    }

    @Override
    public List<Movie> filter(List<Movie> movies) {
        List<Movie> filteredMovies = nextFilter.filter(movies);
        List<Movie> finalMovies = new ArrayList<>();
        for (Movie movie : filteredMovies) {
            if (movie.getRating()== rating)
                finalMovies.add(movie);
        }
        return finalMovies;
    }

}