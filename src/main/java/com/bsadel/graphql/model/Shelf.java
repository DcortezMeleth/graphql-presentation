package com.bsadel.graphql.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "shelfs")
public class Shelf {

    @Id
    @GeneratedValue
    private Long id;

    @Version
    private long version;

    @Column(name = "nr")
    private int nr;

    @Column(name = "size")
    private int size;

    @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER, mappedBy = "shelf")
    private List<Beer> beers = new ArrayList<>();

}
