package com.example.backendforhack.repository;

import com.example.backendforhack.entity.DriverEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriversRepository extends JpaRepository<DriverEntity, Long> {

}
