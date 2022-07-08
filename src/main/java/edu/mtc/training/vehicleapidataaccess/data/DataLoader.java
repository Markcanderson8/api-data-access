package edu.mtc.training.vehicleapidataaccess.data;

import edu.mtc.training.vehicleapidataaccess.entities.Review;
import edu.mtc.training.vehicleapidataaccess.entities.Vehicle;
import edu.mtc.training.vehicleapidataaccess.repository.ReviewRepository;
import edu.mtc.training.vehicleapidataaccess.repository.VehicleRepository;
import edu.mtc.training.vehicleapidataaccess.services.VehicleService;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
  private final Logger logger = LoggerFactory.getLogger(DataLoader.class);

  @Autowired
  private ReviewRepository reviewRepository;

  @Autowired
  private VehicleRepository vehicleRepository;

  private Vehicle vehicle1;
  private Vehicle vehicle2;
  private Vehicle vehicle3;
  private Vehicle vehicle4;
  private Vehicle vehicle5;
  private Vehicle vehicle6;
  private Review review1;
  private Review review2;
  private Review review3;
  private Review review4;
  private Review review5;
  private Review review6;
  private Review review7;

  @Override
  public void run(String... strings) {
    logger.info("Loading data...");

    loadVehicles();
    loadReviews();
  }

  private void loadVehicles() {
    vehicle1 = vehicleRepository.save(new Vehicle("Car", "Ford", "Mustang", 1968));
    vehicle2 = vehicleRepository.save(new Vehicle("Car", "Chevrolet", "Camaro", 2020));
    vehicle3 = vehicleRepository.save(new Vehicle("Car", "Porsche", "Boxter", 2016));
    vehicle4 = vehicleRepository.save(new Vehicle("Car", "BMW", "M3", 2015));
    vehicle5 = vehicleRepository.save(new Vehicle("Truck", "Ford", "F250", 2019));
    vehicle6 = vehicleRepository.save(new Vehicle("Truck", "Ford", "F150", 2020));
  }

  private void loadReviews() {
    review1 = reviewRepository.save(new Review("The car of my dreams", "For so many years I have wanted a car like this", 4, new java.util.Date(System.currentTimeMillis()), "mark111", vehicle1));
    review2 = reviewRepository.save(new Review("Camaro is the best", "Would recommend to anyone", 5, new java.util.Date(System.currentTimeMillis()), "jesse123", vehicle2));
    review3 = reviewRepository.save(new Review("Porsche boxter is number 1", "You definitely have to own one", 5, new java.util.Date(System.currentTimeMillis()), "jj332", vehicle3));
    review4 = reviewRepository.save(new Review("One of the Best BMW's ever made", "This car is one for the record books", 4, new java.util.Date(System.currentTimeMillis()), "mm34", vehicle4));
    review5 = reviewRepository.save(new Review("F150 stay away", "Lest than 30000 miles and needed a transmission just garbage", 1, new java.util.Date(System.currentTimeMillis()), "alanm33", vehicle5));
    review6 = reviewRepository.save(new Review("A good truck", "While it was good to me I wouldn't recommend, go with a chevy", 2, new java.util.Date(System.currentTimeMillis()), "aarony44", vehicle6));
    review7 = reviewRepository.save(new Review("It's a favorite", "I can't say much other than you need one of these", 5, new java.util.Date(System.currentTimeMillis()), "melissaj332", vehicle4));

  }
}
