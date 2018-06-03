package com.bsadel.graphql.query;

import com.bsadel.graphql.model.Beer;
import com.bsadel.graphql.model.Brewery;
import com.bsadel.graphql.repositories.BeerRepository;
import com.bsadel.graphql.repositories.BreweryRepository;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class BeerQueryResolver implements GraphQLQueryResolver {

    private final BeerRepository beerRepository;

    private final BreweryRepository breweryRepository;

    public List<Beer> getAllBeers() {
        return new ArrayList<>(beerRepository.findAll());
    }

    public List<Brewery> getAllBreweries() {
        return new ArrayList<>(breweryRepository.findAll());
    }
}
