package com.hungdev.services;

import org.springframework.stereotype.Service;

import com.hungdev.dtos.GraduateInfoRequest;
import com.hungdev.repositories.GraduationRepository;

@Service
public class GraduationServiceImpl implements GraduationService {
	private GraduationRepository graduationRepository;

	public GraduationServiceImpl(GraduationRepository graduationRepository) {
		super();
		this.graduationRepository = graduationRepository;
	}

	@Override
	public void saveGraduation(GraduateInfoRequest request) {
		graduationRepository.saveGraduation(request);
	}

}
