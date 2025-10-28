package movieBooking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;
import movieBooking.repository.MovieRepository;

@SpringBootApplication
public class MovieBookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieBookingApplication.class, args);
	}

	@Autowired
	private MovieRepository movieRepository;

	@PostConstruct
	public void init() {
		movieRepository.loadMovies();
	}

}
