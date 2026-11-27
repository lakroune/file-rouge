package youcode.ma.SkillCheckAI.services;

import youcode.ma.SkillCheckAI.dto.requests.AdminRequest;
import youcode.ma.SkillCheckAI.dto.responses.AdminResponse;

public interface AdminService {

    AdminResponse create(AdminRequest request);
}
