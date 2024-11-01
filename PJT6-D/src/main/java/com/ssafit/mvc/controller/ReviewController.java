package com.ssafit.mvc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafit.mvc.model.dto.Review;
import com.ssafit.mvc.model.service.ReviewService;

@RestController
@RequestMapping("/review")
public class ReviewController {

	ReviewService rs;

	public ReviewController(ReviewService rs) {
		this.rs = rs;
	}

	@PostMapping("/write")
	public ResponseEntity<Review> writeReview(@ModelAttribute Review review) {
		rs.writeReview(review);
		return new ResponseEntity<Review>(review, HttpStatus.CREATED);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteReview(@PathVariable int id) {
		boolean isDeleted = rs.removeReview(id);
		if (isDeleted) {
			return ResponseEntity.ok("성공적으로 댓글이 삭제되엇습니다.");
		}
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed");
	}

	@PutMapping("/{id}")
	public ResponseEntity<Void> update(@PathVariable int id, @RequestBody Review review) {
		review.setId(id);
		rs.modifyReview(review);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
}
