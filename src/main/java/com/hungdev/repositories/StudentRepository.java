package com.hungdev.repositories;


import com.hungdev.dtos.GraduateInfoRequest;

public interface StudentRepository {
	void saveStudent(GraduateInfoRequest request);
}
