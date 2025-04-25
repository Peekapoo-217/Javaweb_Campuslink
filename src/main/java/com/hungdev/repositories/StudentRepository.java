package com.hungdev.repositories;


import org.springframework.stereotype.Repository;

import com.hungdev.dtos.GraduateInfoRequest;

@Repository
public interface StudentRepository {
	void saveStudent(GraduateInfoRequest request);
}
