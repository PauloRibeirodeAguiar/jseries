package br.com.senai.jseries;

import br.com.senai.jseries.service.JsonServiceImpl;
import br.com.senai.jseries.service.model.DadosSerie;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JseriesApplication {

    public static void main(String[] args) throws JsonProcessingException {
        SpringApplication.run(JseriesApplication.class, args);

        String json = """
        {
          "Title":"Gilmore Girls",
          "Year":"2000–2007",
          "Rated":"TV-PG",
          "Released":"05 Oct 2000",
          "Runtime":"57S min",
          "Genre":"Comedy, Drama",
          "Director":"N/A",
          "Writer":"Amy Sherman-Palladino",
          "Actors":"Lauren Graham, Alexis Bledel, Keiko Agena",
          "Plot":"A dramedy centering around the relationship between a thirtysomething single mother and her teen daughter living in Stars Hollow, Connecticut.",
          "Language":"English",
          "Country":"United States",
          "Awards":"Won 1 Primetime Emmy. 23 wins & 85 nominations total",
          "Poster":"https://m.media-amazon.com/images/M/MV5BMzM2OGZjMTItNzc2OS00YzA4LWE0ZTUtYzE5NjU0MTIyZjcyXkEyXkFqcGc@._V1_SX300.jpg",
          "Ratings":[{"Source":"Internet Movie Database","Value":"8.2/10"}],
          "Metascore":"N/A",
          "imdbRating":"8.2",
          "imdbVotes":"167,052",
          "imdbID":"tt0238784",
          "Type":"series",
          "totalSeasons":"7",
          "Response":"True"
        }
        """;

        JsonServiceImpl jsonService = new JsonServiceImpl();

        // Desserializa
        DadosSerie serie = jsonService.lerJson(json, DadosSerie.class);

        // Converte de volta para JSON bonito
        String jsonBonito = jsonService.paraJsonBonito(serie);

        System.out.println(jsonBonito);
    }
}
