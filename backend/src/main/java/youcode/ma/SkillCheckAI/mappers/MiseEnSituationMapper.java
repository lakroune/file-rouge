package youcode.ma.SkillCheckAI.mappers;

import youcode.ma.SkillCheckAI.dto.responses.MiseEnSituationResponse;
import youcode.ma.SkillCheckAI.entities.MiseEnSituation;

public final class MiseEnSituationMapper {

    private MiseEnSituationMapper() {
    }

    public static MiseEnSituationResponse toResponse(MiseEnSituation miseEnSituation) {
        if (miseEnSituation == null) {
            return null;
        }
        return new MiseEnSituationResponse(
                miseEnSituation.getId(),
                miseEnSituation.getEnonce(),
                miseEnSituation.getType(),
                miseEnSituation.getBareme(),
                miseEnSituation.getSessionEvaluation() == null ? null : miseEnSituation.getSessionEvaluation().getId(),
                miseEnSituation.getSolution() == null ? null : miseEnSituation.getSolution().getId(),
                miseEnSituation.getCompetences().stream().map(competence -> competence.getId()).toList()
        );
    }
}
