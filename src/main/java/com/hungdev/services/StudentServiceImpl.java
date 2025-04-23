package com.hungdev.services;

import com.hungdev.dtos.GraduateInfoRequest;
import com.hungdev.repositories.StudentRepository;

public class StudentServiceImpl implements StudentService {
	private StudentRepository studentRepository;

	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public void saveStudent(GraduateInfoRequest request) {
		studentRepository.saveStudent(request);
	}
}
