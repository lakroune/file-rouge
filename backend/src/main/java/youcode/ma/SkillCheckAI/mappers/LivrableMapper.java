package youcode.ma.SkillCheckAI.mappers;

import youcode.ma.SkillCheckAI.dto.requests.LivrableRequest;
import youcode.ma.SkillCheckAI.dto.responses.LivrableResponse;
import youcode.ma.SkillCheckAI.entities.Apprenant;
import youcode.ma.SkillCheckAI.entities.Livrable;
import youcode.ma.SkillCheckAI.entities.Projet;

public final class LivrableMapper {

    private LivrableMapper() {
    }

    public static Livrable toEntity(
            LivrableRequest request,
            Apprenant apprenant,
            Projet projet
    ) {
        if (request == null) {
            return null;
        }
        Livrable livrable = new Livrable(
                request.getUrlGithub(),
                request.getCommitHash(),
                null,
                request.getStatut(),
                apprenant
        );
        livrable.setProjet(projet);
        return livrable;
    }

    public static LivrableResponse toResponse(Livrable livrable) {
        if (livrable == null) {
            return null;
        }
        return new LivrableResponse(
                livrable.getId(),
                livrable.getUrlGithub(),
                livrable.getCommitHash(),
                livrable.getDateSoumission(),
                livrable.getStatut(),
                livrable.getApprenant() == null ? null : livrable.getApprenant().getId(),
                livrable.getProjet() == null ? null : livrable.getProjet().getId(),
                livrable.getAnalysesCode().stream().map(analyse -> analyse.getId()).toList()
        );
    }
}
