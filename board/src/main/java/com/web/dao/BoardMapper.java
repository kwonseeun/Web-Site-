package com.web.dao;

import java.util.HashMap;
import java.util.List;

import com.web.dto.BoardDTO;

public interface BoardMapper {
	public void insertBoard ( BoardDTO board );
	public void updateBoard ( BoardDTO board );
	public void deleteBoard ( int num );
	public BoardDTO selectOneBoard ( int num );
	public List<BoardDTO> selectSearchBoard ( HashMap<String, Object> params );
	public List<BoardDTO> selectAllBoard();

}


