package com.hungdev.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hungdev.dtos.GraduateInfoRequest;
import com.hungdev.entities.Student;

@Service
public interface StudentService {
	void saveStudent(GraduateInfoRequest request);
	List<Student> searchBasicStudentInfo(String keyword);
	List<Object[]> searchGraduationAndEmployment(String keyword);

}
