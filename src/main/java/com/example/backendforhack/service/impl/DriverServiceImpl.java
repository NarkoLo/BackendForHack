package com.example.backendforhack.service.impl;

import com.example.backendforhack.entity.DriverEntity;
import com.example.backendforhack.repository.DriversRepository;
import com.example.backendforhack.service.DriverService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DriverServiceImpl implements DriverService {

    private final DriversRepository driversRepository;

    public DriverServiceImpl(DriversRepository driversRepository) {
        this.driversRepository = driversRepository;
    }

    @Override
    public List<DriverEntity> findAllDrivers() {
        return driversRepository.findAll();
    }

    @Override
    public Optional<DriverEntity> findById(Long id) {
        return driversRepository.findById(id);
    }

    @Override
    public DriverEntity saveDriver(DriverEntity driverEntity) {
        return driversRepository.save(driverEntity);
    }

    @Override
    public DriverEntity updateDriver(DriverEntity driverEntity) {
        return driversRepository.save(driverEntity);
    }

    @Override
    public void deleteDriver(Long id) {
        driversRepository.deleteById(id);
    }
}
