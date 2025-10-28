package movieBooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import movieBooking.model.FilterDetailsRequest;
import movieBooking.model.Movie;
import movieBooking.repository.MovieRepository;
import movieBooking.service.movieFilter.FilterFactory;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> getMovies(FilterDetailsRequest filterDetails) {
      List<Movie>movies= movieRepository.findAll();
    
      List<Movie>filtered= FilterFactory.getMovieFilter(filterDetails).filter(movies);

      // Paginate with offset and limit
      int fromIndex = Math.min(filterDetails.getOffset(), filtered.size());
      int toIndex = Math.min(fromIndex + filterDetails.getLimit(), filtered.size());
      return filtered.subList(fromIndex, toIndex);
    }
}
