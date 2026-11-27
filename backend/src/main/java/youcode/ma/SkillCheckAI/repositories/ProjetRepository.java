package youcode.ma.SkillCheckAI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import youcode.ma.SkillCheckAI.entities.Projet;

public interface ProjetRepository extends JpaRepository<Projet, Long> {
}
