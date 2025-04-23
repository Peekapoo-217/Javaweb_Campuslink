package com.hungdev.services;

import com.hungdev.dtos.GraduateInfoRequest;
import com.hungdev.repositories.GraduationRepository;

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
