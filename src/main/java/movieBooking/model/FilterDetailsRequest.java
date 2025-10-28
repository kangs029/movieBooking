package movieBooking.model;

import java.util.Optional;

public class FilterDetailsRequest {
    private final Optional<Genre> genre;
    private final Optional<Rating> rating;
    private final int offset;
    private final int limit;

    public FilterDetailsRequest(Optional<Genre> genre,
                                Optional<Rating> rating,
                                int offset,
                                int limit) {
        this.genre = genre;
        this.rating = rating;
        this.offset = offset;
        this.limit = limit;
    }

    public Optional<Genre> getGenre() {
        return genre;
    }

    public Optional<Rating> getRating() {
        return rating;
    }

    public int getOffset() {
        return offset;
    }

    public int getLimit() {
        return limit;
    }
}
