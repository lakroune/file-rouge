package youcode.ma.SkillCheckAI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import youcode.ma.SkillCheckAI.entities.Question;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}
