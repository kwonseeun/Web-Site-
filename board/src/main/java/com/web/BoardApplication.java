package com.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.web.dto.BoardDTO;
import com.web.dto.UserDTO;
import com.web.service.BoardService;
import com.web.service.UserService;

@SpringBootApplication
public class BoardApplication {
	
	private UserService uService;
	private BoardService bService;
	
	public void userTest() {
		
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

	public static void main(String[] args) {
		SpringApplication.run(BoardApplication.class, args);
	}

}
