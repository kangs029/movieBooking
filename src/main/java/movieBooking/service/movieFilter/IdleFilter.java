package movieBooking.service.movieFilter;
import java.util.List;

import movieBooking.model.Movie;
public class IdleFilter implements FilterMovie{

    @Override
    public List<Movie> filter(List<Movie> movies) {
        return movies;
    }

}
