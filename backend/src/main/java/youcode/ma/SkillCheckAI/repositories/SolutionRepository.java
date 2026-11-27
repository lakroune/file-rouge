package youcode.ma.SkillCheckAI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import youcode.ma.SkillCheckAI.entities.Solution;

public interface SolutionRepository extends JpaRepository<Solution, Long> {
}
