package com.jcdepoppe.overflow.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jcdepoppe.overflow.models.Question;
import com.jcdepoppe.overflow.repositories.QuestionRepo;

@Service
public class QuestionService {
	private final QuestionRepo questionRepo;
	
	//This is injecting into a constructor
	public QuestionService(QuestionRepo questionRepo) {
		this.questionRepo = questionRepo;
	}
	
	//Create
	public Question createQuestion(Question q) {
		return questionRepo.save(q);
	}
	
	//Read
	public List<Question> readAllQuestions() {
		return questionRepo.findAll();
	}
	//Create
	
	//Read
	
	//Read all
	
	
}
