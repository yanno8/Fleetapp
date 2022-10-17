package com.kindsonthegenius.Fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kindsonthegenius.Fleetapp.models.VehicleHire;

@Repository
public interface VehicleHireRepository extends JpaRepository<VehicleHire, Integer> {

}
