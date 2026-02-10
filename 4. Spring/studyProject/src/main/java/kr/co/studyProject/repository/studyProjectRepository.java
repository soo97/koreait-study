package kr.co.studyProject.repository;

import org.springframework.boot.json.JsonWriter.Members;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studyProjectRepository extends JpaRepository<Members, Long>{
	
}
