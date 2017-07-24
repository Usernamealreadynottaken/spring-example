package eu.example.controller;

import eu.example.domain.Movie;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MoviesLoader {

    public void loadMoviesFromFile() throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\dgrabare\\IdeaProjects\\spring-example\\src\\main\\java\\eu\\example\\Resources\\moviesTest.csv"));
        List<Movie> moviesList = new ArrayList<>();
            br.readLine();
            String line = br.readLine();

            while (line!=null) {
                String[] tab = line.split(",");
                Movie createMovie = new Movie(tab[0],tab[1],tab[2]);
                moviesList.add(createMovie);
            }

    }





}
