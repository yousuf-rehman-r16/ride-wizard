package com.example.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Ride {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String pickupLocation;
    private String dropoffLocation;
    private LocalDateTime pickupTime;
    private LocalDateTime dropoffTime;

    @ManyToOne
    private Driver driver;
}
