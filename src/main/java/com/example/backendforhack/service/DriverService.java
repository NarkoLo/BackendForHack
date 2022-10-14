package com.example.backendforhack.service;

import com.example.backendforhack.entity.DriverEntity;

import java.util.List;
import java.util.Optional;

public interface DriverService {
    List<DriverEntity> findAllDrivers();
    Optional<DriverEntity> findById(Long id);
    DriverEntity saveDriver(DriverEntity driverEntity);
    DriverEntity updateDriver(DriverEntity driverEntity);
    void deleteDriver(Long id);


}
