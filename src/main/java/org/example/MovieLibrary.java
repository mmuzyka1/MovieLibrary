package org.example;

import java.io.IOException;
import java.util.List;
import java.util.Random;

public class MovieLibrary {

    private List<Movie> movies;

    public List<Movie> getMovies() {
        return movies;
    }

    public static void printRandomMovie(MovieLibrary movieLibrary) {
        System.out.println(movieLibrary.getMovies()
                .get(new Random().nextInt(movieLibrary.getMovies().size()))
                .toString());
    }

    public List<Movie> getMoviesBetweenDates() throws IOException {
        System.out.println("Please, enter the first year: ");
        int firstYear = Integer.parseInt(InputReader.getInputFromUser());
        System.out.println("Please, enter the second year: ");
        int secondYear = Integer.parseInt(InputReader.getInputFromUser());
        return getMovies()
                .stream()
                .filter(movie -> (Integer.parseInt(movie.getDate()) >= firstYear))
                .filter(movie -> (Integer.parseInt(movie.getDate()) <= secondYear))
                .toList();
    }

    public List<Movie> getMoviesByActor() throws IOException {
        System.out.println("Please, enter the name of the actor: ");
        String enteredName = InputReader.getInputFromUser();
        return this.getMovies()
                .stream()
                .filter(movie -> movie.doesActorPlayInMovie(enteredName))
                .toList();
    }

    public void printMovies(List<Movie> moviesToPrint) {
        for (Movie movie : moviesToPrint) {
            System.out.println(movie.getTitle());
        }
    }
}
