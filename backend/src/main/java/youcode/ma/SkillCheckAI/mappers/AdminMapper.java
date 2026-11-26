package youcode.ma.SkillCheckAI.mappers;

import youcode.ma.SkillCheckAI.dto.responses.AdminResponse;
import youcode.ma.SkillCheckAI.entities.Admin;

public final class AdminMapper {

    private AdminMapper() {
    }

    public static AdminResponse toResponse(Admin admin) {
        if (admin == null) {
            return null;
        }
        return new AdminResponse(
                admin.getId(),
                admin.getNom(),
                admin.getPrenom(),
                admin.getEmail(),
                admin.getDateCreation()
        );
    }
}
