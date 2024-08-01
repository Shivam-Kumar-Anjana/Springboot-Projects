package com.Shivam.project.uber.uberApp.services;

import com.Shivam.project.uber.uberApp.dto.DriverDto;
import com.Shivam.project.uber.uberApp.dto.RideDto;
import com.Shivam.project.uber.uberApp.dto.RideRequestDto;
import com.Shivam.project.uber.uberApp.dto.RiderDto;

import java.util.List;

public interface RiderService {

    RideRequestDto requestRide(RideRequestDto rideRequestDto);

    RiderDto cancelRide(Long rideId);

    DriverDto rateDriver(Long rideId, Integer rating);

    RiderDto getMyProfile();

    List<RideDto> getAllMyRides();
}
