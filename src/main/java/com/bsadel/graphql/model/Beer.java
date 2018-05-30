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

    @ManyToOne
    @JoinColumn(name = "brd_id")
    private Brand brand;

    @ManyToOne
    @JoinColumn(name = "sh_id")
    private Shelf shelf;
}
