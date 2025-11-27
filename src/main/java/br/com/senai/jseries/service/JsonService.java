package br.com.senai.jseries.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonService {

    private final ObjectMapper mapper = new ObjectMapper();

    /**
     * Desserializa um JSON para qualquer tipo de objeto.
     * @param json String JSON
     * @param tipoClasse Classe do objeto de destino
     * @param <T> Tipo genérico
     * @return Objeto do tipo T
     * @throws JsonProcessingException Se o JSON for inválido
     */
    public <T> T lerJson(String json, Class<T> tipoClasse) throws JsonProcessingException {
        return mapper.readValue(json, tipoClasse);
    }

    /**
     * Converte qualquer objeto em JSON formatado.
     * @param objeto Objeto de qualquer tipo
     * @param <T> Tipo genérico
     * @return JSON formatado
     * @throws JsonProcessingException Se ocorrer erro na conversão
     */
    public <T> String paraJsonBonito(T objeto) throws JsonProcessingException {
        return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(objeto);
    }
}
