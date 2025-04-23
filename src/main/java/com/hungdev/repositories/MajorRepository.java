package com.hungdev.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hungdev.entities.Major;

@Repository
public interface MajorRepository {
	List<Major> getAllMajors();

}
