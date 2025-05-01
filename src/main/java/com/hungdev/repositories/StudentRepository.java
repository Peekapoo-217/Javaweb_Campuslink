package com.hungdev.repositories;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.hungdev.dtos.GraduateInfoRequest;
import com.hungdev.entities.Student;

@Repository
public interface StudentRepository {
	void saveStudent(GraduateInfoRequest request);
	List<Student> searchBasicStudentInfo(String keyword);
	List<Object[]> searchGraduationAndEmployment(String keyword);
	Student getStudentByNationalID(String nationalID);
	void updateStudent(Student student);
    void deleteStudentByNationalID(String nationalID); 
}
