package com.Shivam.project.uber.uberApp.strategies.impl;

import com.Shivam.project.uber.uberApp.dto.RideRequestDto;
import com.Shivam.project.uber.uberApp.entities.Driver;
import com.Shivam.project.uber.uberApp.strategies.DriverMatchingStrategy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverMatchingNearestDriverStrategy implements DriverMatchingStrategy {
    @Override
    public List<Driver> FindMatchingDrivers(RideRequestDto rideRequestDto) {
        return List.of();
    }
}
