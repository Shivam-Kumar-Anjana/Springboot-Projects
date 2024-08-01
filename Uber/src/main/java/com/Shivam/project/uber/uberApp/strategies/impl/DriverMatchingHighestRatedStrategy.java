package com.Shivam.project.uber.uberApp.strategies.impl;

import com.Shivam.project.uber.uberApp.dto.RideRequestDto;
import com.Shivam.project.uber.uberApp.entities.Driver;
import com.Shivam.project.uber.uberApp.strategies.DriverMatchingStrategy;

import java.util.List;

public class DriverMatchingHighestRatedStrategy implements DriverMatchingStrategy {
    @Override
    public List<Driver> FindMatchingDrivers(RideRequestDto rideRequestDto) {
        return List.of();
    }
}
