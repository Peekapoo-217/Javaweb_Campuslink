package com.hungdev.repositories;

import org.springframework.stereotype.Repository;

import com.hungdev.dtos.GraduateInfoRequest;

@Repository
public interface GraduationRepository {
	void saveGraduation(GraduateInfoRequest request);
    void deleteGraduationByNationalID(String nationalID);
}
