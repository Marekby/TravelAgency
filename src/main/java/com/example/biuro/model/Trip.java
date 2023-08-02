package com.example.biuro.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tripId;

    //    origin:
    //FK1 airportId
    @ManyToOne
    private Airport origin;

    //    destination:
    //FK2 airportId
    @ManyToOne
    private Airport destination;
    //FK3 hotelId
    @ManyToOne
    private Hotel hotelDestination;

    @Column(name = "departure_date")
    private LocalDate departureDate;

    @Column(name = "return_date")
    private LocalDate returnDate;

    @Column(name = "days_number")
    private Integer daysNumber;

    @Column(name = "type")
    private String type;
    // BB, HB, FB, AI

    @Column(name = "adult_price")
    private Integer adultPrice;

    @Column(name = "child_price")
    private Integer childPrice;

    @Column(name = "promoted")
    private Boolean promoted;

    @Column(name = "adult_places")
    private Integer adultPlaces;

    @Column(name = "child_places")
    private Integer childPlaces;






}
