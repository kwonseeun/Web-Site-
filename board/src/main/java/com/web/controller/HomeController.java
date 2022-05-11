package com.web.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.dto.BoardDTO;
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
		
		@RequestMapping("/register")
		public String register(Model model) {
			return "register";
		}
		
		@RequestMapping("/select")
		public String select(Model model) {
			List<BoardDTO> boardList = bService.getBoardList();
			model.addAttribute("boardList", boardList);
			
			return "select";
		}
}
