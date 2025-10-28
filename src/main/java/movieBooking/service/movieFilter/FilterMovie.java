package movieBooking.service.movieFilter;

import java.util.List;

import movieBooking.model.Movie;

public interface FilterMovie {
    List<Movie> filter(List<Movie> movies);
}
