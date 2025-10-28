package movieBooking.service.movieFilter;

import java.util.ArrayList;
import java.util.List;

import movieBooking.model.Genre;
import movieBooking.model.Movie;

public class GenereFilter implements FilterMovie{
    private final Genre genre;
    private final FilterMovie nextFilter;

    public GenereFilter(Genre genre, FilterMovie nextFilter) {
        this.genre = genre;
        this.nextFilter = nextFilter;
    }

    @Override
    public List<Movie> filter(List<Movie> movies) {
        List<Movie> filteredMovies = nextFilter.filter(movies);
        List<Movie> finalMovies = new ArrayList<>();
        for (Movie movie : filteredMovies) {
            if (movie.getGenre()== genre)
                finalMovies.add(movie);
        }
        return finalMovies;
    }

}
