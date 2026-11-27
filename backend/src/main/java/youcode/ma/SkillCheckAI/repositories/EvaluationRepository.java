package youcode.ma.SkillCheckAI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import youcode.ma.SkillCheckAI.entities.Evaluation;

public interface EvaluationRepository extends JpaRepository<Evaluation, Long> {
}
