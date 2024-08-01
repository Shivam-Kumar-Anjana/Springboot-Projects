package com.Shivam.project.uber.uberApp.strategies.impl;

import com.Shivam.project.uber.uberApp.dto.RideRequestDto;
import com.Shivam.project.uber.uberApp.strategies.RideFareCalculationStrategies;

public class RideFareSurgePricingCalculationStrategy  implements RideFareCalculationStrategies {
    @Override
    public double calculateFare(RideRequestDto rideRequestDto) {
        return 0;
    }
}
