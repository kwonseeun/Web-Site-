package com.web.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.dao.BoardMapper;
import com.web.dto.BoardDTO;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardMapper bMapper;

	@Override
	public void insertBoard(BoardDTO board) {
		bMapper.insertBoard( board );
	}

	@Override
	public void updateBoard(BoardDTO board) {
		bMapper.updateBoard( board );
	}

	@Override
	public void deleteBoard(int num) {
		bMapper.deleteBoard( num );
	}

	@Override
	public BoardDTO getBoard(int num) {
		return bMapper.selectOneBoard( num );
	}

	@Override
	public List<BoardDTO> getBoardList() {
		return bMapper.selectAllBoard();
	}

	@Override
	public List<BoardDTO> getBoardSearchList(HashMap<String, Object> params) {
		return bMapper.selectSearchBoard( params );
	}
	

}
