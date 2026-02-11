package kr.co.studyProject.repository;

import org.springframework.boot.json.JsonWriter.Members;
import org.springframework.data.jpa.repository.JpaRepository;

import kr.co.studyProject.entity.ProjectEntity;

public interface studyProjectRepository extends JpaRepository<Members, Long>{
	boolean existByUserId(String userId);
	boolean existsByEmail(String email);
	ProjectEntity findByemail(String email);
}
