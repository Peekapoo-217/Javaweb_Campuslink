package com.hungdev.services;

import org.springframework.stereotype.Service;

import com.hungdev.dtos.GraduateInfoRequest;

@Service
public interface StudentService {

	void saveStudent(GraduateInfoRequest request);
}
