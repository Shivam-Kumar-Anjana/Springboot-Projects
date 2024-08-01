package com.Shivam.project.uber.uberApp.services;

import com.Shivam.project.uber.uberApp.dto.DriverDto;
import com.Shivam.project.uber.uberApp.dto.RideDto;
import com.Shivam.project.uber.uberApp.dto.RideRequestDto;
import com.Shivam.project.uber.uberApp.dto.RiderDto;
import com.Shivam.project.uber.uberApp.entities.Driver;
import com.Shivam.project.uber.uberApp.entities.Ride;
import com.Shivam.project.uber.uberApp.entities.enums.RideStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface RideService {

   Ride getRideById(Long rideId);

   void matchWithDrivers(RideRequestDto rideRequestDto);

   Ride createNewRide(RideRequestDto rideRequestDto, Driver driver);

   Ride updateRideStatus(Long rideId, RideStatus rideStatus);

   Page<Ride> getAllRidesOfRider(Long riderId, PageRequest pageRequest);

   Page<Ride> getAllRidesOfDriver(Long driverId, PageRequest pageRequest);
}
