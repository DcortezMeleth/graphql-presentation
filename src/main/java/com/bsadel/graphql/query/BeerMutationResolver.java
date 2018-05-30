package com.bsadel.graphql.query;

import com.bsadel.graphql.model.Beer;
import com.bsadel.graphql.repositories.BeerRepository;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeerMutationResolver implements GraphQLMutationResolver {

    @Autowired
    private BeerRepository beerRepository;

    public Beer addBeer(String name) {
        Beer beer = new Beer();
        beer.setName(name);
        return beerRepository.save(beer);
    }
}
