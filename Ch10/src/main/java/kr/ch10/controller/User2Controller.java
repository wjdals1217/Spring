package kr.ch10.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.ch10.dto.User2DTO;
import kr.ch10.entity.User2Entity;
import kr.ch10.service.User2Service;

@RestController
public class User2Controller {
	
	@Autowired
	private User2Service service;
	
	@GetMapping("/user2")
	public List<User2DTO> list(){
		
		List<User2DTO> user2s = service.selectUser2s();
		return user2s;
	}
	
	@GetMapping("/user2/{id}")
	public User2DTO user2 (@PathVariable("id") String id) {
		return service.selectUser2(id);
	}
	
	@PostMapping("/user2")
	public void register (User2DTO user2) {
		service.insertUser2(user2);
	}
	
	@PutMapping("/user2")
	public void modify(User2DTO user2) {
		service.updateUser2(user2);		
	}
	
	@DeleteMapping("/user2/{id}")
	public void delete(@PathVariable("id") String id) {
		service.deleteUser2(id);
	}
	
}
