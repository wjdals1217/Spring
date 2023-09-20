package ch04.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ch04.dto.ModelDTO;

@Controller
public class AnnotationController {
	
	@RequestMapping(value = "/annotation/param", method = RequestMethod.GET)
	public String param() {
		return "/annotation/param";
	}

	@RequestMapping(value = "/annotation/param1", method = RequestMethod.POST)
	// @RequestParam 생략 가능
	public String param1(@RequestParam("uid") String uid, Model model) {
		System.out.println("uid : "+uid);
		
		// 모델참조를 통한 View 데이터 출력(JSP에서 req.setAttribute()와 같음)
		model.addAttribute("uid", uid);
		
		return "/result/param";
	}
	
	@PostMapping("/annotation/param2")
	public String param2(Model model, String uid, String name) {
		
		System.out.println("uid : "+uid);
		System.out.println("name : "+name);
		
		model.addAttribute("uid", uid);
		model.addAttribute("name", name);
		
		return "/result/param";
	}
	
	@PostMapping("/annotation/param3")
	public String param3(Model model, String uid, String name, int age, String hp) { // 인자의 순서가 바뀌어도 됨
		model.addAttribute("uid", uid);
		model.addAttribute("name", name);
		model.addAttribute("hp", hp);
		model.addAttribute("age", age);
		
		return "/result/param";
	}

	
	// @ModelAttribute 실습
	@GetMapping("/annotation/model")
	public String model() {
		return "/annotation/model";
	}
	
	// @ModelAttribute에 Model model.addAttribute가 내장되어 있음. @ModelAttribute도 생략가능 
	@PostMapping("/annotation/model1")
	public String model1(@ModelAttribute ModelDTO dto) {
		return "/result/model";
	}
	@PostMapping("/annotation/model2")
	public String model2(@ModelAttribute("user") ModelDTO dto) {
		return "/result/model";
	}
	@PostMapping("/annotation/model3")
	public String model3(ModelDTO dto) {
		return "/result/model";
	}
}
