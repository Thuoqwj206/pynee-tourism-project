package com.example.pyneebackend.entities;
import jakarta.persistence.*;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "booking")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "booking_id")
    private Long bookingId;

    @ManyToOne
    @JoinColumn(name = "tour_id")
    private Tour tour;

//    @ManyToOne
//    @JoinColumn(name = "customer_id")
//    private Customer customer;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "booking_date")
    private Date bookingDate;

    @Enumerated(EnumType.STRING)
    private BookingStatus status;

    // Getters and setters are still generated by @Data
}
