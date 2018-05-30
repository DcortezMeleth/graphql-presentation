package com.bsadel.graphql.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "brands")
public class Brand {

    @Id
    @GeneratedValue
    private Long id;

    @Version
    private long version;

    @Column(name = "name")
    private String name;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "brand", fetch = FetchType.EAGER)
    private List<Beer> beers = new ArrayList<>();
}
