package com.web.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.web.dto.BoardDTO;
import com.web.dto.UserDTO;
import com.web.service.BoardService;
import com.web.service.UserService;

@Controller
public class HomeController {

		private BoardService bService;
		
		private UserService uService;
		
		public HomeController(BoardService b, UserService u) {
			this.bService=b;
			this.uService=u;
		}
		
		@RequestMapping("/")
		public String home(Model model) {
				return "home";
		}
		
		@GetMapping(value="/register")
		public String register(Model model) {
			model.addAttribute("check", 1);
			return "register";
		}
		
		@PostMapping(value="/register")
		public String register(Model model, UserDTO user) {
			model.addAttribute("check", 2);
			if (uService.join(user)) {
				model.addAttribute("rsltMsg", "회원가입이 완료되었습니다.");
			}else {
				{model.addAttribute("rsltMsg", "중복된 아이디가 존재합니다. ");}
			}
			return "register";
		}
		
		@RequestMapping("/select")
		public String select(Model model) {
			List<BoardDTO> boardList = bService.getBoardList();
			model.addAttribute("boardList", boardList);
			
			return "select";
		}
		
		@RequestMapping("/write")
		public String write(Model model) {
			return "write";
		}
		
		@RequestMapping("/delete")
		public String delete(Model model) {
			return "delete";
		}
		
		@RequestMapping("/widthraw")
		public String widthraw(Model model) {
			return "widthraw";
		}
		
		@RequestMapping("/user")
		public String user(Model model) {
			return "user";
		}
}
