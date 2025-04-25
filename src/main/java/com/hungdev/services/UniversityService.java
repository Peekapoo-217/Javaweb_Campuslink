package com.hungdev.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hungdev.entities.University;

@Service
public interface UniversityService {
	List<University> getAllUniversity();
}
