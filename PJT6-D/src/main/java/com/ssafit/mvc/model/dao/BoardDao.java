package com.ssafit.mvc.model.dao;

import java.util.List;

import com.ssafit.mvc.model.dto.Board;
import com.ssafit.mvc.model.dto.SearchCondition;

public interface BoardDao {
    // 전체 게시물 조회
    public List<Board> selectAll();
    
    // 특정 게시물 조회
    public Board selectOne(int id);
    
    // 게시물 생성
    public void insertBoard(Board board);
    
    // 게시물 수정
    public void updateBoard(Board board);
    
    // 게시물 삭제
    public void deleteBoard(int id);
    
    // 조회수 증가
    public void updateViewCnt(int id);
    
    // 검색 기능
    public List<Board> search(SearchCondition searchCondition);
}
