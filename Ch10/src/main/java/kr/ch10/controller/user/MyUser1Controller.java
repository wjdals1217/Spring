package kr.ch10.controller.user;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.ch10.dto.User1DTO;
import kr.ch10.service.user.MyUser1Service;

@Controller("user1")
public class MyUser1Controller {
	
	@Autowired
	private MyUser1Service service;
	
	@GetMapping("/user1/list")
	public String list(Model model) {
		List<User1DTO> users = service.selectUser1s();
		model.addAttribute("users", users);
		return "/user1/list";
	}
	
	@GetMapping("/user1/register")
	public String register() {
		return "/user1/register";
	}

	@PostMapping("/user1/register")
	public String register(User1DTO dto) {
		
		service.insertUser1(dto);
		
		return "redirect:/user1/list";
	}
	
	@GetMapping("/user1/modify")
	public String modify(String uid, Model model) {
		
		return "/user1/modify";
	}

}
