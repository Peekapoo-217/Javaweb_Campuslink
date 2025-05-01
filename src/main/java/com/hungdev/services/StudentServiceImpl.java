package com.hungdev.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hungdev.dtos.GraduateInfoRequest;
import com.hungdev.entities.Student;
import com.hungdev.repositories.StudentRepository;

@Service
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
	
	@Override
	public List<Student> searchBasicStudentInfo(String keyword) {
	    return studentRepository.searchBasicStudentInfo(keyword);
	}

	@Override
	public List<Object[]> searchGraduationAndEmployment(String keyword) {
	    return studentRepository.searchGraduationAndEmployment(keyword);
	}

	@Override
	public Student getStudentByNationalID(String nationalID) {
	    return studentRepository.getStudentByNationalID(nationalID);
	}

	@Override
	public void updateStudent(Student student) {
	    studentRepository.updateStudent(student);
	}

	@Override
	public void deleteStudentByNationalID(String nationalID) {
	    studentRepository.deleteStudentByNationalID(nationalID);
	}

	
}
