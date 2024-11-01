package com.ssafit.mvc.model.service;

import java.util.List;

import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
		return boardDao.selectAll();
	}

	@Override
	public Board readBoard(int id) {
		boardDao.updateViewCnt(id);
		return boardDao.selectOne(id);
	}

	@Transactional
	@Override
	public void writeBoard(Board board) {
		boardDao.insertBoard(board);
	}

	@Transactional
	@Override
	public void modifyBoard(Board board) {
		boardDao.updateBoard(board);
	}

	@Transactional
	@Override
	public boolean removeBoard(int id) {
		int result = boardDao.deleteBoard(id);
		return result == 1;
		
	}

	@Override
	public List<Board> search(SearchCondition searchCondition) {
		return boardDao.search(searchCondition);
	}
	
}
