package com.hungdev.repositories;

import com.hungdev.dtos.GraduateInfoRequest;

public interface GraduationRepository {
	void saveGraduation(GraduateInfoRequest request);
}
