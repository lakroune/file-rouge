package youcode.ma.SkillCheckAI.mappers;

import youcode.ma.SkillCheckAI.dto.responses.ProjetResponse;
import youcode.ma.SkillCheckAI.entities.Projet;

public final class ProjetMapper {

    private ProjetMapper() {
    }

    public static ProjetResponse toResponse(Projet projet) {
        if (projet == null) {
            return null;
        }
        return new ProjetResponse(
                projet.getId(),
                projet.getTitre(),
                projet.getDescription(),
                projet.getDateCreation(),
                projet.getDateDebut(),
                projet.getDateLimite(),
                projet.getStatut(),
                projet.getFormateur() == null ? null : projet.getFormateur().getId(),
                projet.getCahierDesCharges() == null ? null : projet.getCahierDesCharges().getId(),
                projet.getLivrables().stream().map(livrable -> livrable.getId()).toList(),
                projet.getPromotions().stream().map(promotion -> promotion.getId()).toList(),
                projet.getCompetences().stream().map(competence -> competence.getId()).toList()
        );
    }
}
