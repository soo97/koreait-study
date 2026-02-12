package kr.co.studyProject.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import kr.co.studyProject.entity.ProjectEntity;

public interface studyProjectRepository extends JpaRepository<ProjectEntity, Long>{
	boolean existsByUserId(String userId);
	boolean existsByEmail(String email);
	ProjectEntity findByUserId(String userId);


	}

