package youcode.ma.SkillCheckAI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import youcode.ma.SkillCheckAI.entities.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {
}
