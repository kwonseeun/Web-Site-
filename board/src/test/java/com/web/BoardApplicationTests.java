package com.web;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.web.dao.BoardMapper;
import com.web.dao.UserMapper;
import com.web.dto.BoardDTO;
import com.web.dto.UserDTO;
import com.web.service.BoardService;
import com.web.service.UserService;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class BoardApplicationTests {
	
	@Autowired
	private UserService uService;
	@Autowired
	private BoardService bService;

	@Test
	void contextLoads() {
		
		UserDTO user = new UserDTO();
		user.setUserId("test");
		user.setUserPw("1234");
		user.setUserName("테스트");
		user.setUserGender("여");
		user.setUserEmail("test@naver.com");
		uService.join(user);
		System.out.println(uService.getUser("ddidddidi"));
		System.out.println("로그인 결과 " +uService.login("test2", "test2222"));
	}
	
	public void boardTest() {
		BoardDTO board = new BoardDTO();
		board.setNum(1972);
		board.setPassword("1111");
		board.setTitle("blog");
		board.setContent("zeze");
		bService.insertBoard(board);
		
		for (BoardDTO b : bService.getBoardList()) {
			System.out.println(b);
		}
	}
}
