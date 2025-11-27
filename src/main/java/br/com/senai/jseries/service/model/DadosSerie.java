package br.com.senai.jseries.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import java.util.List;

public record DadosSerie(
        @JsonAlias("Title") String Title,
        @JsonAlias("Year") String Year,
        @JsonAlias("Rated") String Rated,
        @JsonAlias("Released") String Released,
        @JsonAlias("Runtime") String Runtime,
        @JsonAlias("Genre") String Genre,
        @JsonAlias("Director") String Director,
        @JsonAlias("Writer") String Writer,
        @JsonAlias("Actors") String Actors,
        @JsonAlias("Plot") String Plot,
        @JsonAlias("Language") String Language,
        @JsonAlias("Country") String Country,
        @JsonAlias("Awards") String Awards,
        @JsonAlias("Poster") String Poster,
        @JsonAlias("Ratings") List<Rating> Ratings,
        @JsonAlias("Metascore") String Metascore,
        @JsonAlias("imdbRating") String imdbRating,
        @JsonAlias("imdbVotes") String imdbVotes,
        @JsonAlias("imdbID") String imdbID,
        @JsonAlias("Type") String Type,
        @JsonAlias("totalSeasons") String totalSeasons,
        @JsonAlias("Response") String Response
) {}
