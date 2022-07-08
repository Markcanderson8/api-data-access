package edu.mtc.training.vehicleapidataaccess.services;

import edu.mtc.training.vehicleapidataaccess.entities.Vehicle;
import edu.mtc.training.vehicleapidataaccess.repository.VehicleRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class VehicleServiceImpl implements VehicleService {

  private List<Vehicle> vehicles = new ArrayList<>();
  @Autowired
  private VehicleRepository vehicleRepository;

  @Override
  public List<Vehicle> getVehicles() {
    List<Vehicle> retVehicles = new ArrayList<>();
    retVehicles = vehicleRepository.findAll();
    return retVehicles;
  }
}
