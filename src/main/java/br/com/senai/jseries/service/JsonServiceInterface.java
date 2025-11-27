package br.com.senai.jseries.service;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface JsonServiceInterface {

    /**
     * Desserializa um JSON para um objeto do tipo T.
     * @param json JSON a ser convertido
     * @param tipoClasse Classe do objeto
     * @param <T> Tipo genérico
     * @return Objeto do tipo T
     * @throws JsonProcessingException Se ocorrer erro de parsing
     */
    <T> T lerJson(String json, Class<T> tipoClasse) throws JsonProcessingException;

    /**
     * Converte qualquer objeto em JSON formatado.
     * @param objeto Objeto de qualquer tipo
     * @param <T> Tipo genérico
     * @return JSON formatado
     * @throws JsonProcessingException Se ocorrer erro de conversão
     */
    <T> String paraJsonBonito(T objeto) throws JsonProcessingException;
}
