package youcode.ma.SkillCheckAI.mappers;

import youcode.ma.SkillCheckAI.dto.responses.PromotionResponse;
import youcode.ma.SkillCheckAI.entities.Promotion;

public final class PromotionMapper {

    private PromotionMapper() {
    }

    public static PromotionResponse toResponse(Promotion promotion) {
        if (promotion == null) {
            return null;
        }
        return new PromotionResponse(
                promotion.getId(),
                promotion.getNom(),
                promotion.getDateDebut(),
                promotion.getDateFin(),
                promotion.getFormateurs().stream().map(formateur -> formateur.getId()).toList(),
                promotion.getApprenants().stream().map(apprenant -> apprenant.getId()).toList(),
                promotion.getProjets().stream().map(projet -> projet.getId()).toList()
        );
    }
}
