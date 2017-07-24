package eu.example.controller;

import eu.example.domain.Movies;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by DGRABARE on 2017-07-24.
 */
public class MoviesLoadFile {

    public void zaczytajPlikDoListyIMapy() throws FileNotFoundException {

        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\dgrabare\\Desktop\\ml-20m\\moviesTest.csv"));
        List<Movies> moviesList = new ArrayList<>();
        try {
            String line1 = br.readLine();
            String line = br.readLine();

            while(line!=null){
                String[] tab = line.split(",");
                Movies createMovie = new Movies(tab[0],tab[1],tab[2]);
                moviesList.add(createMovie);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }





}
