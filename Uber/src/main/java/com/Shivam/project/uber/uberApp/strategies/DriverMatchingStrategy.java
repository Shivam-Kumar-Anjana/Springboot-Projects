package com.Shivam.project.uber.uberApp.strategies;

import com.Shivam.project.uber.uberApp.dto.RideRequestDto;
import com.Shivam.project.uber.uberApp.entities.Driver;

import java.util.List;

public interface DriverMatchingStrategy {

    List<Driver> FindMatchingDrivers(RideRequestDto rideRequestDto);
}
