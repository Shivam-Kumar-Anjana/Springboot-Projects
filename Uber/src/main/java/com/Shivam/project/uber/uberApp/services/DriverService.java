package com.Shivam.project.uber.uberApp.services;

import com.Shivam.project.uber.uberApp.dto.DriverDto;
import com.Shivam.project.uber.uberApp.dto.RideDto;
import com.Shivam.project.uber.uberApp.dto.RiderDto;
import com.Shivam.project.uber.uberApp.entities.Ride;

import java.util.List;

public interface DriverService {

    RiderDto cancelRide(Long rideId);

    RiderDto startRide(Long rideId);

    RiderDto endRide(Long rideId);

    RiderDto rateRider(Long rideId, Integer rating);

    DriverDto getMyProfile();

    List<RideDto> getAllMyRides();

}
