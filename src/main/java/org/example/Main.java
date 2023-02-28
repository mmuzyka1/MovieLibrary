package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        MovieLibrary movieLibrary = new ObjectMapper().readValue(new File("src/main/resources/movies.json"), MovieLibrary.class);

        while (true) {
            printMenu();
            int option = Integer.parseInt(reader.readLine());
            switch (option) {
                case 1 -> movieLibrary.getMoviesBetweenDates();
                case 2 -> MovieLibrary.printRandomMovie(movieLibrary);
                case 3 -> movieLibrary.getMoviesByActor();
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
