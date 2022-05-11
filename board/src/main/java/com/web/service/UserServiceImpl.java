package com.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.dao.UserMapper;
import com.web.dto.UserDTO;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper uMapper;

	@Override
	public boolean login(String userId, String userPw) {
		UserDTO user = uMapper.selectOneUser(userId);
		
		if (user!=null) {
			if (user.getUserPw().equals(userPw)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean join(UserDTO user) {
		if (uMapper.selectOneUser(user.getUserId())==null) {
			
			uMapper.insertUser(user);
			return true;
			
		}else {
			return false;
		}
	}

	@Override
	public void modify(UserDTO user) {
		uMapper.updateUser(user);
	}

	@Override
	public void widthraw(String userId) {
		uMapper.deleteUser(userId);
	}

	@Override
	public UserDTO getUser(String userId) {
		return uMapper.selectOneUser(userId);
	}

	@Override
	public List<UserDTO> getUserList() {
		return uMapper.selectAllUser();
	}

}
