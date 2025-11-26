package br.com.senai.jseries.runner;

import br.com.senai.jseries.service.ApiService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartRunner implements CommandLineRunner {

    private final ApiService apiService;

    public StartRunner(ApiService apiService) {
        this.apiService = apiService;
    }

    @Override
    public void run(String... args) throws Exception {

        String url = "https://www.omdbapi.com/?t=gilmore+girls&apikey=6585022c";

        System.out.println("Chamando API externa...");
        String json = apiService.obterDados(url);

        System.out.println("Resposta:");
        System.out.println(json);
    }
}
