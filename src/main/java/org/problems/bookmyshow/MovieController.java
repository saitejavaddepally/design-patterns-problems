package org.problems.bookmyshow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MovieController {

    private HashMap<String, List<Movie>> cityMovies = new HashMap<>();
    private List<Theatre> movieAvailableTheaters;


    public void addMovie(String city, Movie movie){
        cityMovies.putIfAbsent(city, new ArrayList<>());
        cityMovies.get(city).add(movie);
    }

    public List<Movie> getMoviesByCity(String city) {
        return cityMovies.getOrDefault(city, List.of());
    }

}
