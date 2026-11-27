package youcode.ma.SkillCheckAI.mappers;

import youcode.ma.SkillCheckAI.dto.requests.FormateurRequest;
import youcode.ma.SkillCheckAI.dto.responses.FormateurResponse;
import youcode.ma.SkillCheckAI.entities.Formateur;

public final class FormateurMapper {

    private FormateurMapper() {
    }

    public static Formateur toEntity(FormateurRequest request) {
        if (request == null) {
            return null;
        }
        return new Formateur(
                request.getNom(),
                request.getPrenom(),
                request.getEmail(),
                request.getPassword(),
                request.getSpecialite()
        );
    }

    public static FormateurResponse toResponse(Formateur formateur) {
        if (formateur == null) {
            return null;
        }
        return new FormateurResponse(
                formateur.getId(),
                formateur.getNom(),
                formateur.getPrenom(),
                formateur.getEmail(),
                formateur.getDateCreation(),
                formateur.getSpecialite(),
                formateur.getProjets().stream().map(projet -> projet.getId()).toList(),
                formateur.getPromotions().stream().map(promotion -> promotion.getId()).toList(),
                formateur.getEvaluations().stream().map(evaluation -> evaluation.getId()).toList()
        );
    }
}
