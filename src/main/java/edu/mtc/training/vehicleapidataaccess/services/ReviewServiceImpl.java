package edu.mtc.training.vehicleapidataaccess.services;

import edu.mtc.training.vehicleapidataaccess.entities.Review;
import edu.mtc.training.vehicleapidataaccess.repository.ReviewRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewServiceImpl implements ReviewService {

  @Autowired
  private ReviewRepository reviewRepository;

  @Override
  public List<Review> getReviews() {
    List<Review> retReviews = new ArrayList<>();
    retReviews = reviewRepository.findAll();

    return retReviews;
  }
}
