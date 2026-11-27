package youcode.ma.SkillCheckAI.mappers;

import java.util.List;

import youcode.ma.SkillCheckAI.dto.requests.PromotionRequest;
import youcode.ma.SkillCheckAI.dto.responses.PromotionResponse;
import youcode.ma.SkillCheckAI.entities.Apprenant;
import youcode.ma.SkillCheckAI.entities.Formateur;
import youcode.ma.SkillCheckAI.entities.Promotion;
import youcode.ma.SkillCheckAI.entities.Projet;

public final class PromotionMapper {

    private PromotionMapper() {
    }

    public static Promotion toEntity(
            PromotionRequest request,
            List<Formateur> formateurs,
            List<Apprenant> apprenants,
            List<Projet> projets
    ) {
        if (request == null) {
            return null;
        }
        Promotion promotion = new Promotion(request.getNom(), request.getDateDebut(), request.getDateFin());
        promotion.setFormateurs(formateurs);
        promotion.setApprenants(apprenants);
        promotion.setProjets(projets);
        return promotion;
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
