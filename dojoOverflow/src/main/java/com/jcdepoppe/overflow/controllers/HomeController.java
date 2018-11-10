package com.jcdepoppe.overflow.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jcdepoppe.overflow.models.Question;
import com.jcdepoppe.overflow.services.QuestionService;

@RestController
public class HomeController {
	private final QuestionService questionService;
	
	public HomeController(QuestionService questionService) {
		this.questionService = questionService;
	}
	
	//displayAllQuestions
	
	@RequestMapping("/api/questions")
	public List<Question> getAllQuestions(){
		return this.questionService.readAllQuestions();
	}
	
}
