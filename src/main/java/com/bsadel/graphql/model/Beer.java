package com.bsadel.graphql.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "beers")
public class Beer {

    @Id
    @GeneratedValue
    private Long id;

    @Version
    private long version;

    @Column(name = "name")
    private String name;

    @Column(name = "volume")
    private double volume;

    @Column(name = "abv")
    private double abv;

    @Column(name = "score")
    private double score;

    @ManyToOne
    @JoinColumn(name = "brd_id")
    private Brewery brewery;
}
