package com.hungdev.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hungdev.entities.Major;

@Service
public interface MajorService {
	List<Major> getAllMajors();
}
