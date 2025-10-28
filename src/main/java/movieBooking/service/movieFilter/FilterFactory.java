package movieBooking.service.movieFilter;

import movieBooking.model.FilterDetailsRequest;

public class FilterFactory {
    private FilterFactory(){}

    public static FilterMovie getMovieFilter(
            FilterDetailsRequest filterDetails) {
        FilterMovie filter = new IdleFilter();
        if (filterDetails.getRating().isPresent()) {
            filter = new RatingFilter(filterDetails.
                    getRating().get(),filter);
        }
        if (filterDetails.getGenre().isPresent()) {
            filter = new GenereFilter(filterDetails.
                   getGenre().get(),filter);
        }
        return filter;
    }

}
