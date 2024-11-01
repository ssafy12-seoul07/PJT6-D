package com.ssafit.mvc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafit.mvc.model.dto.Board;
import com.ssafit.mvc.model.service.BoardService;

@RestController
@RequestMapping("/api-board")
public class BoardController {
	private final BoardService boardService;
	
	public BoardController(BoardService boardService) {
		this.boardService = boardService;
	}
	
	// 검색 && 게시물 전체 조회
//	@GetMapping("/board")

	
	// 게시글 상세 보기
	@GetMapping("/board/{id}")
	public ResponseEntity<Board> detail(@PathVariable("id") int id) {
		Board board = boardService.readBoard(id); // service에서 readBoard
		if (board != null) {
			return ResponseEntity.ok(board);
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
	}
	
	// 게시물 등록
	@PostMapping("/board")
	public ResponseEntity<?> write(@ModelAttribute Board board) {
		// 게시물 등록 요청
		boardService.writeBoard(board);
		int id = board.getId();
		return new ResponseEntity<Board>(board, HttpStatus.CREATED);
	}
	
	// 게시글 삭제
	
	
	// 게시글 수정
}
