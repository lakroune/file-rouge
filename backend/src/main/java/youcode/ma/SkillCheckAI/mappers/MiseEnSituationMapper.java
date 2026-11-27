package youcode.ma.SkillCheckAI.mappers;

import java.util.List;

import youcode.ma.SkillCheckAI.dto.requests.MiseEnSituationRequest;
import youcode.ma.SkillCheckAI.dto.responses.MiseEnSituationResponse;
import youcode.ma.SkillCheckAI.entities.MiseEnSituation;
import youcode.ma.SkillCheckAI.entities.Competence;
import youcode.ma.SkillCheckAI.entities.SessionEvaluation;
import youcode.ma.SkillCheckAI.entities.Solution;

public final class MiseEnSituationMapper {

    private MiseEnSituationMapper() {
    }

    public static MiseEnSituation toEntity(
            MiseEnSituationRequest request,
            SessionEvaluation sessionEvaluation,
            Solution solution,
            List<Competence> competences
    ) {
        if (request == null) {
            return null;
        }
        MiseEnSituation miseEnSituation = new MiseEnSituation(
                request.getEnonce(),
                request.getType(),
                request.getBareme()
        );
        miseEnSituation.setSessionEvaluation(sessionEvaluation);
        miseEnSituation.setSolution(solution);
        miseEnSituation.setCompetences(competences);
        return miseEnSituation;
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
