package ch04.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	
	// 출력하려는 view 이름의 메서드
	@RequestMapping(value={"/", "/index"}, method=RequestMethod.GET)
	public String index() {
		return "index";
	}
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello() {
		return "hello";
	}

	@GetMapping("/welcome")
	public String welcome() {
		return "welcome";
	}
	
	@GetMapping("/greeting")
	public String greeting() {
		return "greeting";
	}

	// contextRoot 빠짐
	@GetMapping("/redirect")
	public String redirect() {
		return "redirect:https://www.naver.com/";
	}

	@GetMapping("/forward")
	public String forward() {
		return "forward:/annotation/model";
	}
}
