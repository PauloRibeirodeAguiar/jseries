package br.com.senai.jseries.service.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public record Rating(
        @JsonAlias("Source") String source,
        @JsonAlias("Value") String value
) {}
