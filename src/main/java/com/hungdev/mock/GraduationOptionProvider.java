package com.hungdev.mock;

import java.util.List;

public class GraduationOptionProvider {
	public static List<String> getGraduationTypes(){
		return List.of("Bachelor", "College", "Intermedia");
	}
	
	public static List<String> getDegreeType(){
		return List.of("Excellent", "Good", "Fair", "Average");
	}
}
