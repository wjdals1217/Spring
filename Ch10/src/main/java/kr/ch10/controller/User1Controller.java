package kr.ch10.controller;

import java.util.List;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import kr.ch10.entity.User1Entity;
import kr.ch10.service.User1Service;
@Log4j2
@CrossOrigin("http://localhost:5173")
@Controller // view로 forward
public class User1Controller {
	
	@Autowired
	private User1Service service;
	/*
	* CORS(CrossOrigin Resource Sharing Policy)
	*  - HTTP 웹 서비스 보안 정책 중 하나로 동일 출처의 리소스만 공유하는 원칙(SOP)
	*  - @CrossOrigin 어노테이션으로 특정 Originb 주소를 설정하면 해당 Origin에서만 응답처리
	*
	*/


	@ResponseBody // 클라이언트로 json 객체 보내줌
	@GetMapping("/user1")
	public List<User1Entity> list() {
		List<User1Entity> user1s = service.selectUser1s();
		return user1s; // jackson 내장객체을 이용한 json 변환
	}

	@ResponseBody
	@GetMapping("/user1/{id}")
	public User1Entity user1(@PathVariable("id") String id) {
		return service.selectUser1(id);
	}
	
	@ResponseBody
	@PostMapping("/user1")
	public void register(@RequestBody User1Entity user1) {
		log.info(user1);
		service.insertUser1(user1);
	}
	
	@ResponseBody
	@PutMapping("/user1")
	public void modify(@RequestBody User1Entity user1) {
		service.updateUser1(user1);
	}

	@ResponseBody
	@DeleteMapping("/user1/{id}")
	public void delete(@PathVariable("id") String id) {
		service.deleteUser1(id);
	}
}
