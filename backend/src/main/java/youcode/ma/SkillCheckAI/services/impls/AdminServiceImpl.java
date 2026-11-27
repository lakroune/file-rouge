package youcode.ma.SkillCheckAI.services.impls;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import youcode.ma.SkillCheckAI.dto.requests.AdminRequest;
import youcode.ma.SkillCheckAI.dto.responses.AdminResponse;
import youcode.ma.SkillCheckAI.entities.Admin;
import youcode.ma.SkillCheckAI.mappers.AdminMapper;
import youcode.ma.SkillCheckAI.repositories.AdminRepository;
import youcode.ma.SkillCheckAI.services.AdminService;

@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService {

    private final AdminRepository adminRepository;

    @Override
    public AdminResponse create(AdminRequest request) {
        Admin admin = AdminMapper.toEntity(request);
        Admin savedAdmin = adminRepository.save(admin);
        return AdminMapper.toResponse(savedAdmin);
    }
}
