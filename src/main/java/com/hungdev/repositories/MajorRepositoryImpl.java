package com.hungdev.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.hungdev.configs.DatabaseConfig;
import com.hungdev.entities.Major;

@Repository
public class MajorRepositoryImpl implements MajorRepository {

	@Override
	public List<Major> getAllMajors() {
		List<Major> majors = new ArrayList<Major>();

		String Sql = "SELECT * FROM major";
		
		try (Connection conn = DatabaseConfig.getConnection()) {

			PreparedStatement stmt = conn.prepareStatement(Sql);

			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					Major major = new Major(rs.getString("majorID"), rs.getString("majorName"), rs.getString("majorType"));
					majors.add(major);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return majors;
	}
}
