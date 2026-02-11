package kr.co.studyProject.sevice;

import kr.co.studyProject.DTO.ReqHomeDTO;
import kr.co.studyProject.DTO.ReqloginDTO;
import kr.co.studyProject.DTO.ResloginDTO;

public interface ProjectService {
	
	void home(ReqHomeDTO request);
	
	ResloginDTO login(ReqloginDTO request);
}
