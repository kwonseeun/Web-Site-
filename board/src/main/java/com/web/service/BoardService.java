package com.web.service;

import java.util.HashMap;
import java.util.List;

import com.web.dto.BoardDTO;

public interface BoardService {
	
	public void insertBoard(BoardDTO board);
	
	public void updateBoard(BoardDTO board);
	
	public void deleteBoard(int num);
	
	public BoardDTO getBoard(int num);
	
	public List<BoardDTO> getBoardList();
	
	public List<BoardDTO> getBoardSearchList( HashMap<String,Object> params );

}
