package com.hungdev.services;

import org.springframework.stereotype.Service;

import com.hungdev.dtos.GraduateInfoRequest;

@Service
public interface GraduationService {
	void saveGraduation(GraduateInfoRequest request);
}
