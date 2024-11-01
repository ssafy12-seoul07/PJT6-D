package com.ssafit.mvc.model.service;

import java.util.List;

import com.ssafit.mvc.model.dto.Board;
import com.ssafit.mvc.model.dto.SearchCondition;

public interface BoardService {
    // 전체 게시물 조회
	public List<Board> getBoardList();
	
    // 특정 게시물 조회
    public Board readBoard(int id);
	
    // 게시물 생성
    public void writeBoard(Board board);
    
    // 게시물 수정
    public void modifyBoard(Board board);
    
    // 게시물 삭제
    public boolean removeBoard(int id);
    
    // 검색 버튼을 눌렀을 때 처리할 메서드
    public List<Board> search(SearchCondition searchCondition);
}
