package org.problems.bookmyshow;

import java.util.List;

public class Screen {
    private int screenId;
    private List<Seat> seats;
    private int movieDuration;

    // Constructors, Getters, and Setters
    public Screen(int screenId, List<Seat> seats, int movieDuration) {
        this.screenId = screenId;
        this.seats = seats;
        this.movieDuration = movieDuration;
    }
}
