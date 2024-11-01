package com.ssafit.mvc.model.service;

import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssafit.mvc.model.dao.ReviewDao;
import com.ssafit.mvc.model.dto.Review;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Service
public class ReviewServiceImpl implements ReviewService {

	ReviewDao reviewDao;

	public ReviewServiceImpl(ReviewDao reviewDao) {
		this.reviewDao = reviewDao;
	}

	@Transactional
	@Override
	public void writeReview(Review review) {
		
		reviewDao.insertReview(review);
		
	}

	@Transactional
	@Override
	public void modifyReview(Review review) {
		reviewDao.updateReview(review);
	}

	@Transactional
	@Override
	public boolean removeReview(int id) {
		int ans = reviewDao.deleteReview(id);
		return ans == 1;
	}


}
