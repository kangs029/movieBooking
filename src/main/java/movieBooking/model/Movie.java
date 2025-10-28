package movieBooking.model;

public class Movie {
    private Long id;
    private String title;
    private Genre genre;
    private Rating rating;
    
    public Movie() {
    }
    public Long getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public Genre getGenre() {
        return genre;
    }
    public Rating getRating() {
        return rating;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setGenre(Genre genre) {
        this.genre = genre;
    }
    public void setRating(Rating rating) {
        this.rating = rating;
    }
}
