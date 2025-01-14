package org.problems.bookmyshow;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MovieController movieController = new MovieController();
        TheatreController theatreController = new TheatreController();

        // Create movies
        Movie movie1 = new Movie(1, "Inception", 150);
        Movie movie2 = new Movie(2, "Avatar", 180);

        // Add movies to cities
        movieController.addMovie("New York", movie1);
        movieController.addMovie("Los Angeles", movie2);

        // Create seats
        List<Seat> seats = new ArrayList<>();
        seats.add(new Seat(1, 1, SeatCategory.REGULAR));
        seats.add(new Seat(2, 1, SeatCategory.VIP));

        // Create screens
        List<Screen> screens = new ArrayList<>();
        screens.add(new Screen(1, seats, 150));

        // Create shows
        List<Integer> timings = List.of(12, 15, 18);
        List<Show> shows = new ArrayList<>();
        shows.add(new Show(1, movie1, 12, timings));

        // Create theaters
        Theatre theater = new Theatre(1, "123 Main St", "New York", screens, shows);

        // Add theater to city
        theatreController.addTheater("New York", theater);

        // Fetch and display movies by city
        System.out.println("Movies in New York: " + movieController.getMoviesByCity("New York"));
    }
}
