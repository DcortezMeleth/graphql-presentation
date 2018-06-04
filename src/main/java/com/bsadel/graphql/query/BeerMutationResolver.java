package com.bsadel.graphql.query;

import com.bsadel.graphql.model.Beer;
import com.bsadel.graphql.model.Brewery;
import com.bsadel.graphql.repositories.BeerRepository;
import com.bsadel.graphql.repositories.BreweryRepository;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@RequiredArgsConstructor
public class BeerMutationResolver implements GraphQLMutationResolver {

    private final BeerRepository beerRepository;

    private final BreweryRepository breweryRepository;

    public Beer addBeer(String name, String breweryName) {
        Brewery brewery = breweryRepository.findByName(breweryName);
        Beer beer = new Beer();
        beer.setName(name);
        beer.setBrewery(brewery);
        return beerRepository.save(beer);
    }

    public Brewery addBrewery(String name) {
        Brewery brewery = new Brewery();
        brewery.setName(name);
        brewery.setRegistered(LocalDate.now());
        return breweryRepository.save(brewery);
    }
}
