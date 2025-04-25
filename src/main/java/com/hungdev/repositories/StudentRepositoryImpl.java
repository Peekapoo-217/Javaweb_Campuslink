package com.hungdev.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.springframework.stereotype.Repository;

import com.hungdev.configs.DatabaseConfig;
import com.hungdev.dtos.GraduateInfoRequest;
import com.hungdev.entities.Student;

@Repository
public class StudentRepositoryImpl implements StudentRepository {
	@Override
	public void saveStudent(GraduateInfoRequest u) {

		String sql = "INSERT INTO student (NationalID,FullName,	Email,PhoneNumber,Address) VALUES(?,?,?,?,?)";

		try (Connection conn = DatabaseConfig.getConnection(); PreparedStatement ptmt = conn.prepareStatement(sql)) {

			ptmt.setString(1, u.getNationalID());
			ptmt.setString(2, u.getFullName());
			ptmt.setString(3, u.getEmail());
			ptmt.setString(4, u.getPhoneNumber());
			ptmt.setString(5, u.getAddress());
			ptmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
