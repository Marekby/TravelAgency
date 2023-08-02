package com.example.biuro.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity
public class TripOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tripOrderId;

    @Column(name = "amount")
    private Integer amount;

    //FK1 tripId
    @ManyToOne
    private Trip trip;

    //FK2 clientId
    @ManyToOne
    private Client client;


}
