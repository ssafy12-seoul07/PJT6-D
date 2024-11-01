package com.ssafit.mvc.model.service;

import java.util.List;

import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import com.ssafit.mvc.model.dao.BoardDao;
import com.ssafit.mvc.model.dto.Board;
import com.ssafit.mvc.model.dto.SearchCondition;

@Service
public class BoardServiceImpl implements BoardService {
	
	private final BoardDao boardDao;
	private final ResourceLoader resourceLoader;
	
	public BoardServiceImpl(BoardDao boardDao, ResourceLoader resourceLoader) {
		this.boardDao = boardDao;
		this.resourceLoader = resourceLoader;
	}
	
	@Override
	public List<Board> getBoardList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Board readBoard(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void writeBoard(Board board) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifyBoard(Board board) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeBoard(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Board> search(SearchCondition searchCondition) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
