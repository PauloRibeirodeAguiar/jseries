package br.com.senai.jseries.service.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import java.util.List;

public record DadosSerie(
        @JsonAlias("Title") String title,
        @JsonAlias("Year") String year,
        @JsonAlias("Rated") String rated,
        @JsonAlias("Released") String released,
        @JsonAlias("Runtime") String runtime,
        @JsonAlias("Genre") String genre,
        @JsonAlias("Director") String director,
        @JsonAlias("Writer") String writer,
        @JsonAlias("Actors") String actors,
        @JsonAlias("Plot") String plot,
        @JsonAlias("Language") String language,
        @JsonAlias("Country") String country,
        @JsonAlias("Awards") String awards,
        @JsonAlias("Poster") String poster,
        @JsonAlias("Ratings") List<Rating> ratings,
        @JsonAlias("Metascore") String metascore,
        @JsonAlias("imdbRating") String imdbRating,
        @JsonAlias("imdbVotes") String imdbVotes,
        @JsonAlias("imdbID") String imdbID,
        @JsonAlias("Type") String type,
        @JsonAlias("totalSeasons") String totalSeasons,
        @JsonAlias("Response") String response
) {}
