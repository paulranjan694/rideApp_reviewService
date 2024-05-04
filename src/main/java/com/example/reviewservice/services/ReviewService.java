package com.example.reviewservice.services;

import com.example.reviewservice.models.Review;
import com.example.reviewservice.repositories.ReviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class ReviewService implements CommandLineRunner {

    private ReviewRepository reviewRepository;

    public ReviewService(ReviewRepository reviewRepository){
        this.reviewRepository = reviewRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("**********************");
        Review r = Review.builder().content("Nice ride").rating(4.0).build();
        System.out.println(r);
        reviewRepository.save(r);
    }
}
