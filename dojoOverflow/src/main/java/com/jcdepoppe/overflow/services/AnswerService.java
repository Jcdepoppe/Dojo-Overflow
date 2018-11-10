package com.jcdepoppe.overflow.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jcdepoppe.overflow.models.Answer;
import com.jcdepoppe.overflow.repositories.AnswerRepo;

@Service
public class AnswerService {
	private final AnswerRepo answerRepo;
	
	//This is injecting into a constructor
	public AnswerService(AnswerRepo answerRepo) {
		this.answerRepo = answerRepo;
	}
	
	//Create
	public Answer createAnswer(Answer a) {
		return answerRepo.save(a);
	}
	
	//Read
	public Answer readAnswer(Long id) {
		Optional<Answer> optionalAnswer = answerRepo.findById(id);
		 if(optionalAnswer.isPresent()) {
	        	return optionalAnswer.get(); 
	        } else {
	            return null;
	        }
	}
	//Update
	
	//Delete
	
	//ReadAll
	public List<Answer> readAllAnswers(){
		return answerRepo.findAll();
	}
}
