package edu.mtc.training.vehicleapidataaccess.repository;

import edu.mtc.training.vehicleapidataaccess.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}
