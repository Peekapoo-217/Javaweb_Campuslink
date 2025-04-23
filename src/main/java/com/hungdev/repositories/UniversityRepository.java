package com.hungdev.repositories;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.hungdev.entities.University;

@Repository
public interface UniversityRepository {
	List<University> getAllUniversities();
}
