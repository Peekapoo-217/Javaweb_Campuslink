package com.hungdev.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hungdev.services.StudentService;


@Controller
public class SearchController {
    private StudentService studentService;
    
    @Autowired
    public SearchController(StudentService studentService) {
        this.studentService = studentService;
    }
    
    
    //form1
    @GetMapping("/search_form")
    public String searchStudentForm() {
        return "search_form";
    }

    
    @PostMapping("/search_form")
    public String searchStudentResults(@RequestParam("keyword") String keyword, Model model) {
        model.addAttribute("students", studentService.searchBasicStudentInfo(keyword));
        return "search_form";
    }
    
    //form2
    @GetMapping("/search_employment")
    public String searchEmploymentForm() {
        return "search_employment";
    }

    @PostMapping("/search_employment")
    public String searchEmploymentResults(@RequestParam("keyword") String keyword, Model model) {
        model.addAttribute("graduationEmploymentList", studentService.searchGraduationAndEmployment(keyword));
        return "search_employment";
    }

}
