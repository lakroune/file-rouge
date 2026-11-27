package youcode.ma.SkillCheckAI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import youcode.ma.SkillCheckAI.entities.Livrable;

public interface LivrableRepository extends JpaRepository<Livrable, Long> {
}
