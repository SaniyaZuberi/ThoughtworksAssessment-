package com.tw.pro.classes;

public class Movie {
    private final String title;
    private final String studio;
    private final String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    public static Movie[] getPg(Movie[] movies) {
        Movie[] rateMovies = new Movie[movies.length];
        int pointer = 0;
        for (Movie m : movies) {
            if (m.rating == "PG") {
                rateMovies[pointer] = m;
                pointer += 1;
            }
        }
        return rateMovies;
    }
}
