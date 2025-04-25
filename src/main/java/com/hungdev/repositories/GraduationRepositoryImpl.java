package com.hungdev.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.springframework.stereotype.Repository;

import com.hungdev.configs.DatabaseConfig;
import com.hungdev.dtos.GraduateInfoRequest;

@Repository
public class GraduationRepositoryImpl implements GraduationRepository {
	@Override
	public void saveGraduation(GraduateInfoRequest request) {
		String sql = "INSERT INTO graduation(NationalID, UniversityID, MajorID,GraduationType, GraduationDate, DegreeType) VALUES(?,?,?,?,?,?)";

		try (Connection conn = DatabaseConfig.getConnection(); PreparedStatement ptmt = conn.prepareStatement(sql)) {

			ptmt.setString(1, request.getNationalID());
			ptmt.setString(2, request.getUniversityID());
			ptmt.setString(3, request.getMajorID());
			ptmt.setString(4, request.getGraduationType());
			ptmt.setDate(5, new java.sql.Date(request.getGraduationDate().getTime()));
			ptmt.setString(6, request.getDegreeType());


			ptmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}