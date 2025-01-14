package org.problems.bookmyshow;

public class Movie {
    private int movieId;
    String movieName;
    private int movieDuration;

    public Movie(int movieId, String movieName, int movieDuration) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.movieDuration = movieDuration;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getMovieDuration() {
        return movieDuration;
    }

    public void setMovieDuration(int movieDuration) {
        this.movieDuration = movieDuration;
    }
}
