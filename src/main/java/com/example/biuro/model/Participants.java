package com.example.biuro.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity
public class Participants {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long participantsId;

    // FK1 clientId
    @ManyToOne
    private Client client;

    // FK2 tripOrderId
    @ManyToOne
    private TripOrder tripOrder;

    @Column(name = "is_adult")
    private Boolean isAdult;

}
