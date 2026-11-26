package youcode.ma.SkillCheckAI.mappers;

import youcode.ma.SkillCheckAI.dto.responses.LivrableResponse;
import youcode.ma.SkillCheckAI.entities.Livrable;

public final class LivrableMapper {

    private LivrableMapper() {
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
