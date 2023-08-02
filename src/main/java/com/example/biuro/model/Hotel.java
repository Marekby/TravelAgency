package com.example.biuro.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Entity;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long hotelId;

    @Column(name = "name")
    private String name;

    @Column(name = "standard")
    private Integer standard;

    @Column(name = "description")
    private String description;

    //FK1 cityId
    @ManyToOne
    private City city;


}
