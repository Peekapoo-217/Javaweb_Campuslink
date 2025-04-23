package com.hungdev.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.hungdev.configs.DatabaseConfig;
import com.hungdev.entities.University;

@Repository
public class UniversityRepositoryImpl implements UniversityRepository {
	@Override
	public List<University> getAllUniversities() {
		List<University> universities = new ArrayList<University>();

		String sql = "SELECT * FROM university";

		try (Connection conn = DatabaseConfig.getConnection();
				PreparedStatement stmt = conn.prepareStatement(sql);

				ResultSet rs = stmt.executeQuery()) {

			while (rs.next()) {
				University u = new University(rs.getInt("universityID"), rs.getString("universityName"),
						rs.getString("address"), rs.getString("phoneNumber"));
				universities.add(u);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return universities;
	}
}