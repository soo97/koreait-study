package kr.co.studyProject.sevice;

import kr.co.studyProject.DTO.ReqHomeDTO;
import kr.co.studyProject.DTO.ReqloginDTO;
import kr.co.studyProject.DTO.ResloginDTO;

public interface ProjectService {
	
	void signup(ReqHomeDTO request);
	
	public ResloginDTO login(ReqloginDTO request);
}
