package com.bsadel.graphql.repositories;

import com.bsadel.graphql.model.Brewery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BreweryRepository extends JpaRepository<Brewery, Long> {

    public Brewery findByName(String name);
}
