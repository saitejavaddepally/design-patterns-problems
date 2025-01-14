package org.problems.bookmyshow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheatreController {
    private Map<String, List<Theatre>> cityVsTheater = new HashMap<>();
    private List<Movie> movies;

    public void addTheater(String city, Theatre theater) {
        cityVsTheater.putIfAbsent(city, new ArrayList<>());
        cityVsTheater.get(city).add(theater);
    }

    public List<Theatre> getTheatersByCity(String city) {
        return cityVsTheater.getOrDefault(city, List.of());
    }

    // Getters and setters


    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public Map<String, List<Theatre>> getCityVsTheater() {
        return cityVsTheater;
    }

    public void setCityVsTheater(Map<String, List<Theatre>> cityVsTheater) {
        this.cityVsTheater = cityVsTheater;
    }
}
