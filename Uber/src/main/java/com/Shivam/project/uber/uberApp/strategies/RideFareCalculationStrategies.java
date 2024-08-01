package com.Shivam.project.uber.uberApp.strategies;

import com.Shivam.project.uber.uberApp.dto.RideRequestDto;

public interface RideFareCalculationStrategies {

    double calculateFare(RideRequestDto rideRequestDto);

}
