package com.example.controller;

import com.example.entity.Ride;
import com.example.service.RideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rides")
public class RideController {

    @Autowired
    private RideService rideService;

    @GetMapping
    public List<Ride> getAllRides() {
        return rideService.getAllRides();
    }

    @GetMapping("/{id}")
    public Ride getRideById(@PathVariable Long id) {
        return rideService.getRideById(id);
    }

    @PostMapping
    public Ride addRide(@RequestBody Ride ride) {
        return rideService.addRide(ride);
    }

    @DeleteMapping("/{id}")
    public void deleteRide(@PathVariable Long id) {
        rideService.deleteRide(id);
    }
}
