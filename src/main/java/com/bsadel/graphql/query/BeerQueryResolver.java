package com.bsadel.graphql.query;

import com.bsadel.graphql.model.Beer;
import com.bsadel.graphql.repositories.BeerRepository;
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

    public List<Beer> getAllBeers() {
        /*Brand brokreacja = new Brand("Brokreacja");
        Brand alebrowar = new Brand("Alebrowar");
        Brand pinta = new Brand("Pinta");
        List<Beer> beers = new ArrayList<>();
        beers.add(new Beer("Atak chmielu", pinta, 500, 5.5));
        beers.add(new Beer("Sweet Cow", alebrowar, 500, 6.5));
        beers.add(new Beer("Gravedigger", brokreacja, 330, 8.5));
        beers.add(new Beer("Deep Dark See", brokreacja, 330, 7.5));
        return beers;*/
        return new ArrayList<>(beerRepository.findAll());
    }
}
