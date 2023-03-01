package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        MovieLibrary movieLibrary = new ObjectMapper().readValue(new File("src/main/resources/movies.json"), MovieLibrary.class);

        while (true) {
            printMenu();
            switch (Integer.parseInt(InputReader.getInputFromUser())) {
                case 1 -> movieLibrary.printMovies(movieLibrary.getMoviesBetweenDates());
                case 2 -> MovieLibrary.printRandomMovie(movieLibrary);
                case 3 -> movieLibrary.printMovies(movieLibrary.getMoviesByActor());
            }
        }
    }

    public static void printMenu() {
        System.out.println("Please, choose one of the options: ");
        System.out.println("1. Check the movies released between two dates.");
        System.out.println("2. Display information about a random movie.");
        System.out.println("3. Check the movies by an actor that played in them.");
    }
}
