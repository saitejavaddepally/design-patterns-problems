package org.problems.bookmyshow;

import java.util.List;

public class Show {
    private int showId;
    private Movie movie;
    private int startTime;
    private List<Integer> timings;

    // Constructors, Getters, and Setters
    public Show(int showId, Movie movie, int startTime, List<Integer> timings) {
        this.showId = showId;
        this.movie = movie;
        this.startTime = startTime;
        this.timings = timings;
    }
}
