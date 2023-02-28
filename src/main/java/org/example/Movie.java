package org.example;

import java.util.List;

public class Movie {

    private String title;
    private Director director;
    private String genre;
    private String date;
    private List<Actor> actors;

    public String getTitle() {
        return title;
    }

    public Director getDirector() {
        return director;
    }

    public String getGenre() {
        return genre;
    }

    public String getDate() {
        return date;
    }

    public List<Actor> getActors() {
        return actors;
    }

    private String getActorsNames() {
        StringBuilder actorsNames = new StringBuilder();
        for (int i = 0; i < this.getActors().size() - 1; i++) {
            actorsNames.append(this.getActors().get(i).getFullName()).append(", ");
        }
        actorsNames.append(this.getActors().get(actors.size() - 1).getFullName());
        return actorsNames.toString();
    }

    @Override
    public String toString() {
        return "Title: " + this.getTitle() +
                "\n" + "Director: " + this.getDirector().getFirstName() + " " + this.getDirector().getLastName() +
                "\n" + "Genre: " + this.getGenre() +
                "\n" + "Release year: " + this.getDate() +
                "\n" + "Actors: " + this.getActorsNames();
    }

    public boolean doesActorPlayInMovie(String actor) {
        return this.actors.stream().anyMatch(actor1 -> actor1.getFullName().equals(actor));
    }
}
