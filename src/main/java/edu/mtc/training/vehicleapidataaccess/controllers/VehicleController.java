package edu.mtc.training.vehicleapidataaccess.controllers;

import edu.mtc.training.vehicleapidataaccess.entities.Review;
import edu.mtc.training.vehicleapidataaccess.entities.Vehicle;
import edu.mtc.training.vehicleapidataaccess.services.VehicleService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {

  @Autowired
  private VehicleService vehicleService;

  @GetMapping
  public List<Vehicle> getAllVehicles() {
    List<Vehicle> retVehicles = vehicleService.getVehicles();
    return retVehicles;
  }

}
