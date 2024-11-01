package com.ssafit.mvc.controller;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafit.mvc.model.dto.Board;
import com.ssafit.mvc.model.dto.SearchCondition;
import com.ssafit.mvc.model.service.BoardService;

@RestController
@RequestMapping("/api-board")
public class BoardController {
	private final BoardService boardService;
	
	public BoardController(BoardService boardService) {
		this.boardService = boardService;
	}
	
	// 검색 && 게시물 전체 조회
	@GetMapping("/board")
	public ResponseEntity<?> list(@ModelAttribute SearchCondition condition) {
		List<Board> list = boardService.search(condition);
		if (list == null || list.size() == 0) {
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<List<Board>>(list, HttpStatus.OK);
		}
		
	}

	
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
	public ResponseEntity<?> write(@RequestBody Board board) {
		// 게시물 등록 요청
		boardService.writeBoard(board);
		int id = board.getId();
		return new ResponseEntity<Board>(board, HttpStatus.CREATED);
	}
	
	// 게시글 삭제
	@DeleteMapping("/board/{id}")
	public ResponseEntity<String> delete(@PathVariable("id") int id) {
		boolean isDeleted = boardService.removeBoard(id);
		
		if (isDeleted)
			return ResponseEntity.status(HttpStatus.OK).build();
		else
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed");
	}
	
	// 게시글 수정
	@PutMapping("/board/{id}")
	public ResponseEntity<Void> update(@PathVariable("id") int id, @RequestBody Board board) {
		board.setId(id);
		boardService.modifyBoard(board);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
}


