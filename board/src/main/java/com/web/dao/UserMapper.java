package com.web.dao;

import java.util.List;

import com.web.dto.UserDTO;

public interface UserMapper {
	
	public void insertUser ( UserDTO user );
	
	public void updateUser ( UserDTO user );
	
	public void deleteUser ( String userId );
	
	public UserDTO selectOneUser ( String userId );
	
	public List<UserDTO> selectAllUser();
}
