package com.ssafit.mvc.model.dao;

import com.ssafit.mvc.model.dto.Review;

public interface ReviewDao {
	// 댓글 작성
	public void insertReview(Review review);
	// 댓글 수정
	public void updateReview(Review review);
	// 댓글 삭제
	public int deleteReview(int id);
}
