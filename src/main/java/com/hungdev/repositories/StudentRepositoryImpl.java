package com.hungdev.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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

	@Override
	public List<Student> searchBasicStudentInfo(String keyword) {
		List<Student> students = new ArrayList();
		String sql = "SELECT * FROM student WHERE FullName LIKE ? OR NationalID LIKE ?";

		try (Connection conn = DatabaseConfig.getConnection(); PreparedStatement ptmt = conn.prepareStatement(sql)) {
			ptmt.setString(1, "%" + keyword + "%");
			ptmt.setString(2, "%" + keyword + "%");
			ResultSet rs = ptmt.executeQuery();
			while (rs.next()) {
				Student s = new Student();
				s.setNationalID(rs.getString("NationalID"));
				s.setFullName(rs.getString("FullName"));
				s.setEmail(rs.getString("Email"));
				s.setPhoneNumber(rs.getString("PhoneNumber"));
				s.setAddress(rs.getString("Address"));
				students.add(s);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return students;
	}

	@Override
	public List<Object[]> searchGraduationAndEmployment(String keyword) {
		List<Object[]> results = new ArrayList<>();
		String sql = "SELECT s.NationalID, s.FullName, g.MajorID, g.UniversityID, e.MajorID, e.CompanyAddress, e.Duration " +
	             "FROM student s " +
	             "JOIN graduation g ON s.NationalID = g.NationalID " +
	             "JOIN employment e ON s.NationalID = e.NationalID " +
	             "WHERE s.FullName LIKE ? OR s.NationalID LIKE ?";

		try (Connection conn = DatabaseConfig.getConnection(); PreparedStatement ptmt = conn.prepareStatement(sql)) {
			ptmt.setString(1, "%" + keyword + "%");
			ptmt.setString(2, "%" + keyword + "%");
			ResultSet rs = ptmt.executeQuery();
			while (rs.next()) {
				Object[] row = new Object[7];
				row[0] = rs.getString(1);
				row[1] = rs.getString(2);
				row[2] = rs.getString(3);
				row[3] = rs.getString(4);
				row[4] = rs.getString(5);
				row[5] = rs.getString(6);
				row[6] = rs.getInt(7);
				results.add(row);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return results;
	}

}
