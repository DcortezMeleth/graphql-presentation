package com.bsadel.graphql.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "brewery")
public class Brewery {

    @Id
    @GeneratedValue
    private Long id;

    @Version
    private long version;

    @Column(name = "name", unique = true)
    private String name;

    @Column(name = "registered")
    private LocalDate registered;

    @Column(name = "score")
    private Double score;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "brewery", fetch = FetchType.EAGER)
    private List<Beer> beers = new ArrayList<>();
}
