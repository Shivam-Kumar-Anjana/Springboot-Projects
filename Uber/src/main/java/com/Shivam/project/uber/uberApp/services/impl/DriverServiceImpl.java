package com.Shivam.project.uber.uberApp.services.impl;

import com.Shivam.project.uber.uberApp.dto.DriverDto;
import com.Shivam.project.uber.uberApp.dto.RideDto;
import com.Shivam.project.uber.uberApp.dto.RiderDto;
import com.Shivam.project.uber.uberApp.services.DriverService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DriverServiceImpl implements DriverService {
    @Override
    public RiderDto cancelRide(Long rideId) {
        return null;
    }

    @Override
    public RiderDto startRide(Long rideId) {
        return null;
    }

    @Override
    public RiderDto endRide(Long rideId) {
        return null;
    }

    @Override
    public RiderDto rateRider(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public DriverDto getMyProfile() {
        return null;
    }

    @Override
    public List<RideDto> getAllMyRides() {
        return List.of();
    }
}
