package youcode.ma.SkillCheckAI.services.impls;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import youcode.ma.SkillCheckAI.entities.Apprenant;
import youcode.ma.SkillCheckAI.repositories.ApprenantRepository;
import youcode.ma.SkillCheckAI.services.ApprenantService;

@Service
@RequiredArgsConstructor
public class ApprenantServiceImpl implements ApprenantService {

    private final ApprenantRepository apprenantRepository;

    @Override
    public List<Apprenant> findAll() {
        return apprenantRepository.findAll();
    }
}
