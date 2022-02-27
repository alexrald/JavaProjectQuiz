package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.entity.SurveyEntity;

@Repository
public interface SurveyRepository extends JpaRepository<SurveyEntity, Long> {
}
