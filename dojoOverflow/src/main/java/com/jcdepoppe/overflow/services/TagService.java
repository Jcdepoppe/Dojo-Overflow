package com.jcdepoppe.overflow.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jcdepoppe.overflow.models.Tag;
import com.jcdepoppe.overflow.repositories.TagRepo;



@Service
public class TagService {
	private final TagRepo tagRepo;
	
	//This is injecting into a constructor
	public TagService(TagRepo tagRepo) {
		this.tagRepo = tagRepo;
	}
	
	//Create
	public Tag createTag(Tag t) {
		return tagRepo.save(t);
	}
	
	//Read
	public Tag readTag(Long id) {
		Optional<Tag> optionalTag = tagRepo.findById(id);
		 if(optionalTag.isPresent()) {
	        	return optionalTag.get(); 
	        } else {
	            return null;
	        }
	}
}
