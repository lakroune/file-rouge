package youcode.ma.SkillCheckAI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import youcode.ma.SkillCheckAI.entities.SessionEvaluation;

public interface SessionEvaluationRepository extends JpaRepository<SessionEvaluation, Long> {
}
