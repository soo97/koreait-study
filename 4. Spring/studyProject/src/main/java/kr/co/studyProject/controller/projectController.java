package kr.co.studyProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;
import kr.co.studyProject.DTO.ReqHomeDTO;
import kr.co.studyProject.DTO.ReqloginDTO;
import kr.co.studyProject.DTO.ResloginDTO;
import kr.co.studyProject.sevice.ProjectService;
import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class projectController {

	private final ProjectService projectservice;
	
	@GetMapping
	public String home() {
		return "home";
	}
	
	@GetMapping("/signup/form")
	public String homeform(){
		return "/signup";
	}
	
	@PostMapping("/signup")
	public String home(ReqHomeDTO request) {
		projectservice.signup(request);
		return "/login/form";
	}
	
	@GetMapping("/login/form")
	public String loginForm() {
		return "/login";
	}
	
	@PostMapping("/login")
	public String login(ReqloginDTO request, HttpSession session) {
		ResloginDTO response = projectservice.login(request);
		if(response == null) {
			return "redirect:/signup/form";
		}
		session.setAttribute("LOGIN_USER", response);
		return "redirect:/";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
}
