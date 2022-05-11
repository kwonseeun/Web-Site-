package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
