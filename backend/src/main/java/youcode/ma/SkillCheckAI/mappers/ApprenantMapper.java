package youcode.ma.SkillCheckAI.mappers;

import youcode.ma.SkillCheckAI.dto.requests.ApprenantRequest;
import youcode.ma.SkillCheckAI.dto.responses.ApprenantResponse;
import youcode.ma.SkillCheckAI.entities.Apprenant;
import youcode.ma.SkillCheckAI.entities.Promotion;

public final class ApprenantMapper {

    private ApprenantMapper() {
    }

    public static Apprenant toEntity(ApprenantRequest request, Promotion promotion) {
        if (request == null) {
            return null;
        }
        Apprenant apprenant = new Apprenant(
                request.getNom(),
                request.getPrenom(),
                request.getEmail(),
                request.getPassword(),
                request.getMatricule(),
                request.getDateInscription(),
                request.getNiveau()
        );
        apprenant.setPromotion(promotion);
        return apprenant;
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
