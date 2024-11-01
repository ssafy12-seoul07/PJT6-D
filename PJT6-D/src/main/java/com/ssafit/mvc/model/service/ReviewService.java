package com.ssafit.mvc.model.service;

import com.ssafit.mvc.model.dto.Review;

public interface ReviewService {

	public void writeReview(Review review);

	public void modifyReview(Review review);

	public boolean removeReview(int id);
}
