package kr.co.studyProject.service.Impl;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import kr.co.studyProject.DTO.ReqHomeDTO;
import kr.co.studyProject.DTO.ReqloginDTO;
import kr.co.studyProject.DTO.ResloginDTO;
import kr.co.studyProject.entity.ProjectEntity;
import kr.co.studyProject.repository.studyProjectRepository;
import kr.co.studyProject.sevice.ProjectService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProjectServiceImpl implements ProjectService{
	
	private final studyProjectRepository sprepository;
	private final BCryptPasswordEncoder passwordEncoder;
	
	@Override
	public void signup(ReqHomeDTO request) {
		if(!request.getPassword().equals(request.getPasswordCheck())) {
			System.out.println("비밀번호가 일치하지 않음");
		}
		if(sprepository.existsByUserId(request.getUserId())) {
			System.out.println("이미 사용중인 닉네임");
		}
		
		if(sprepository.existsByEmail(request.getEmail())) {
			System.out.println("이미 사용중인 이메일");
		}
		
		String encodePassword = passwordEncoder.encode(request.getPassword());
		
		ProjectEntity pentity = new ProjectEntity();
		pentity.setUserId(request.getUserId());
		pentity.setUserName(request.getUserName());
		pentity.setEmail(request.getEmail());
		pentity.setPassword(encodePassword);
		
		sprepository.save(pentity);
	}
	
	@Override
	public ResloginDTO login(ReqloginDTO request) {
		
		ProjectEntity pentity = sprepository.findByEmail(request.getEmail());
		if(pentity == null) {
			return null;
		}
		if(!passwordEncoder.matches(request.getPassword(), pentity.getPassword())) {
			return null;
		}
		
		ResloginDTO response = new ResloginDTO();
		response.setId(pentity.getId());
		response.setUserId(pentity.getUserId());
		response.setEmail(pentity.getEmail());
		response.setUserName(pentity.getUserName());
		response.setCreatedAt(pentity.getCreatedAt());
		response.setUpdateAt(pentity.getUpdatedAt());
		
		return response;
	}
	

}
