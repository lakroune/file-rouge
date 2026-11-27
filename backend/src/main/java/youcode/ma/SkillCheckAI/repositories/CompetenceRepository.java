package youcode.ma.SkillCheckAI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import youcode.ma.SkillCheckAI.entities.Competence;

public interface CompetenceRepository extends JpaRepository<Competence, Long> {
}
