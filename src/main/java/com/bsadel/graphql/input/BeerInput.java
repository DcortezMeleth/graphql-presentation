package com.bsadel.graphql.input;

import lombok.Data;

@Data
public class BeerInput {

    private String name;

    private double volume;

    private double abv;

    private Double score;

    private String brewery;
}
