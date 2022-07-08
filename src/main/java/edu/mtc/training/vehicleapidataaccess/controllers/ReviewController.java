package edu.mtc.training.vehicleapidataaccess.controllers;

import edu.mtc.training.vehicleapidataaccess.entities.Review;
import edu.mtc.training.vehicleapidataaccess.services.ReviewService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reviews")
public class ReviewController {
  @Autowired
  private ReviewService reviewService;

  @GetMapping
  public List<Review> getAllReviews() {
    List<Review> retReviews = reviewService.getReviews();
    return retReviews;
  }
}
