package youcode.ma.SkillCheckAI.mappers;

import java.util.List;

import youcode.ma.SkillCheckAI.dto.requests.ProjetRequest;
import youcode.ma.SkillCheckAI.dto.responses.ProjetResponse;
import youcode.ma.SkillCheckAI.entities.CahierDesCharges;
import youcode.ma.SkillCheckAI.entities.Competence;
import youcode.ma.SkillCheckAI.entities.Formateur;
import youcode.ma.SkillCheckAI.entities.Promotion;
import youcode.ma.SkillCheckAI.entities.Projet;

public final class ProjetMapper {

    private ProjetMapper() {
    }

    public static Projet toEntity(
            ProjetRequest request,
            Formateur formateur,
            CahierDesCharges cahierDesCharges,
            List<Promotion> promotions,
            List<Competence> competences
    ) {
        if (request == null) {
            return null;
        }
        Projet projet = new Projet(
                request.getTitre(),
                request.getDescription(),
                request.getDateDebut(),
                request.getDateLimite(),
                request.getStatut()
        );
        projet.setFormateur(formateur);
        projet.setCahierDesCharges(cahierDesCharges);
        projet.setPromotions(promotions);
        projet.setCompetences(competences);
        return projet;
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
