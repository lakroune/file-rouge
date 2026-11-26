package youcode.ma.SkillCheckAI.mappers;

import youcode.ma.SkillCheckAI.dto.responses.ApprenantResponse;
import youcode.ma.SkillCheckAI.entities.Apprenant;

public final class ApprenantMapper {

    private ApprenantMapper() {
    }

    public static ApprenantResponse toResponse(Apprenant apprenant) {
        if (apprenant == null) {
            return null;
        }
        return new ApprenantResponse(
                apprenant.getId(),
                apprenant.getNom(),
                apprenant.getPrenom(),
                apprenant.getEmail(),
                apprenant.getDateCreation(),
                apprenant.getMatricule(),
                apprenant.getDateInscription(),
                apprenant.getNiveau(),
                apprenant.getPromotion() == null ? null : apprenant.getPromotion().getId()
        );
    }
}
