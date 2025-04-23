package com.hungdev.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hungdev.entities.Major;
import com.hungdev.repositories.MajorRepository;

@Service
public class MajorServiceImpl implements MajorService {

	@Autowired
	private MajorRepository repository;
	@Override
	public List<Major> getAllMajors() {
		return repository.getAllMajors();
	}

}
