package br.com.senai.jseries.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonServiceImpl implements JsonServiceInterface {

    private final ObjectMapper mapper;

    public JsonServiceImpl() {
        this.mapper = new ObjectMapper();
    }

    @Override
    public <T> T lerJson(String json, Class<T> tipoClasse) throws JsonProcessingException {
        return mapper.readValue(json, tipoClasse);
    }

    @Override
    public <T> String paraJsonBonito(T objeto) throws JsonProcessingException {
        return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(objeto);
    }
}
