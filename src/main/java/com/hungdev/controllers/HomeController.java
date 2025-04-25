package com.hungdev.controllers;

import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.hungdev.dtos.GraduateInfoRequest;

import com.hungdev.entities.Major;
import com.hungdev.entities.University;
import com.hungdev.mock.GraduationOptionProvider;
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

	public HomeController(MajorService majorService, UniversityService universityService, StudentService studentService,
			GraduationService graduationService) {
		super();
		this.majorService = majorService;
		this.universityService = universityService;
		this.studentService = studentService;
		this.graduationService = graduationService;
	}

	@GetMapping("/")
	public String home(Model model) {
		
		model.addAttribute("universities", universityService.getAllUniversity());
		model.addAttribute("majors", majorService.getAllMajors());
		
		model.addAttribute("graduationTypes", GraduationOptionProvider.getGraduationTypes());
		model.addAttribute("degreeTypes", GraduationOptionProvider.getDegreeType());

		model.addAttribute("degreeTypes", GraduationOptionProvider.getDegreeType());
		return "add";
	}

	@PostMapping("/save")
	public String saveGraduateInfo(@ModelAttribute GraduateInfoRequest request ,
		    Model model) {
		List<Major> majors = majorService.getAllMajors();
		List<University> universities = universityService.getAllUniversity();

		try {
			studentService.saveStudent(request);
			graduationService.saveGraduation(request);
			model.addAttribute("success");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Request values: " + request);
			model.addAttribute("error");
		}
		
		model.addAttribute("universities", universities);
		model.addAttribute("majors", majors);
		model.addAttribute("graduationTypes", GraduationOptionProvider.getGraduationTypes());
		model.addAttribute("degreeTypes", GraduationOptionProvider.getDegreeType());
		
		return "add";
	}

}
