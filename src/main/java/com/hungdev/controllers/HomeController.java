package com.hungdev.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.hungdev.dtos.GraduateInfoRequest;
import com.hungdev.entities.Major;
import com.hungdev.entities.University;
import com.hungdev.services.GraduationService;
import com.hungdev.services.MajorService;
import com.hungdev.services.StudentService;
import com.hungdev.services.UniversityService;

@Controller
public class HomeController {

	private MajorService majorService;
	private UniversityService universityService;
	private StudentService studentService;
	private GraduationService graduationService;

	@Autowired
	public HomeController(MajorService majorService, UniversityService universityService) {
		super();
		this.majorService = majorService;
		this.universityService = universityService;
	}

	@GetMapping("/")
	public String home(Model model) {
		List<Major> majors = majorService.getAllMajors();
		List<University> universities = universityService.getAllUniversity();

		model.addAttribute("universities", universities);
		model.addAttribute("majors", majors);

		return "home";
	}

	@PostMapping("/save")
	public String saveGraduateInfo(GraduateInfoRequest request, Model model) {
		List<Major> majors = majorService.getAllMajors();
		List<University> universities = universityService.getAllUniversity();

		try {
			studentService.saveStudent(request);
			graduationService.saveGraduation(request);
			model.addAttribute("success");
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("error");
		}

		model.addAttribute("universities", universities);
		model.addAttribute("majors", majors);

		return "home";
	}

}
