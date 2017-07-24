package eu.example.domain;

import com.google.common.base.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * Created by DGRABARE on 2017-07-24.
 */

@Entity
public class Movie {

    @Id
    @NotNull
    @Size(max = 64)
    @Column(name = "movieId", nullable = false, updatable = false)
    private String movieId;

    @Column(name = "title")
    String title;

    @Column(name = "genres")
    String genres;


    public Movie(String movieId, String title, String genres) {
        this.movieId = movieId;
        this.title = title;
        this.genres = genres;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }


    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("movieId", movieId)
                .add("title", title)
                .add("title", genres)
                .toString();
    }

}
