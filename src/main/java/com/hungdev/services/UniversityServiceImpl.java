package com.hungdev.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hungdev.entities.University;
import com.hungdev.repositories.UniversityRepository;

@Service
public class UniversityServiceImpl implements UniversityService {

	@Autowired
	private UniversityRepository repository;
	
	@Override
	public List<University> getAllUniversity() {
		
		return repository.getAllUniversities();
	}

}
