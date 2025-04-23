package com.hungdev.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.hungdev.configs.DatabaseConfig;
import com.hungdev.dtos.GraduateInfoRequest;

public class GraduationRepositoryImpl implements GraduationRepository {
	@Override
	public void saveGraduation(GraduateInfoRequest request) {
		String sql = "INSERT INTO (NationalID, UniversityID, MajorID,GraduationType, GraduationDate, DegreeType) + VALUES(?,?,?,?,?,?)";

		try (Connection conn = DatabaseConfig.getConnection(); PreparedStatement ptmt = conn.prepareStatement(sql)) {

			ptmt.setInt(1, request.getNationalID());
			ptmt.setInt(2, request.getUniversityID());
			ptmt.setInt(3, request.getMajorID());
			ptmt.setString(4, request.getGraduationType());
			ptmt.setString(5, request.getDegreeType());
			ptmt.setDate(6, request.getGraduationDate());

			ptmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}