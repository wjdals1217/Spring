package kr.ch07.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import kr.ch07.service.User6Service;

@WebMvcTest(controllers = User6Controller.class)
public class User6ControllerTest {
	
	// MVC 테스트를 위한 가상 mvc 객체
	@Autowired
	private MockMvc mvc;	
	
	@MockBean
	private User6Service service;
	
	@Test
	public void list() throws Exception {
		mvc
		.perform(get("/user6/list"))				
		.andExpect(status().isOk())					
		.andExpect(view().name("/user6/list"))		
		.andDo(print());							
	}
	
		
}
