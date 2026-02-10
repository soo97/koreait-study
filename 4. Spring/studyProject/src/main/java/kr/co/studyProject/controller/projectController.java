package kr.co.studyProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.studyProject.sevice.ProjectService;
import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/templates")
@RequiredArgsConstructor
public class projectController {

	private final ProjectService projectservice;
	
	@GetMapping("/home/form")
	public String homeform(){
		return "/home";
	}
}
