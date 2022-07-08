package edu.mtc.training.vehicleapidataaccess.services;

import edu.mtc.training.vehicleapidataaccess.entities.Vehicle;
import java.util.List;
import org.springframework.web.bind.annotation.RequestParam;

public interface VehicleService {
  List<Vehicle> getVehicles();
}
