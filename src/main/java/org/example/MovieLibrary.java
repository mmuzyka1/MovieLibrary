package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Random;

public class MovieLibrary {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private List<Movie> movies;

    public List<Movie> getMovies() {
        return movies;
    }

    public static void printRandomMovie(MovieLibrary movieLibrary) {
        System.out.println(movieLibrary.getMovies().get(new Random().nextInt(movieLibrary.getMovies().size())).toString());
    }

    public void getMoviesBetweenDates() throws IOException {
        System.out.println("Please, enter the first year: ");
        int firstYear = Integer.parseInt(reader.readLine());
        System.out.println("Please, enter the second year: ");
        int secondYear = Integer.parseInt(reader.readLine());
        List<Movie> moviesToPrint = getMovies()
                .stream()
                .filter(movie -> (Integer.parseInt(movie.getDate()) >= firstYear))
                .filter(movie -> (Integer.parseInt(movie.getDate()) <= secondYear))
                .toList();
        for (Movie movie : moviesToPrint) {
            System.out.println(movie.getTitle());
        }
    }

    public void getMoviesByActor() throws IOException {
        System.out.println("Please, enter the name of the actor: ");
        String enteredName = reader.readLine();
        List<Movie> moviesToPrint = this.getMovies()
                .stream()
                .filter(movie -> movie.doesActorPlayInMovie(enteredName))
                .toList();
        for (Movie movie : moviesToPrint) {
            System.out.println(movie.getTitle());
        }
    }
}
