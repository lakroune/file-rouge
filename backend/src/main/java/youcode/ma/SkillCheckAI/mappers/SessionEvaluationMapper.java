package youcode.ma.SkillCheckAI.mappers;

import youcode.ma.SkillCheckAI.dto.responses.SessionEvaluationResponse;
import youcode.ma.SkillCheckAI.entities.SessionEvaluation;

public final class SessionEvaluationMapper {

    private SessionEvaluationMapper() {
    }

    public static SessionEvaluationResponse toResponse(SessionEvaluation sessionEvaluation) {
        if (sessionEvaluation == null) {
            return null;
        }
        return new SessionEvaluationResponse(
                sessionEvaluation.getId(),
                sessionEvaluation.getDateDebut(),
                sessionEvaluation.getDateFin(),
                sessionEvaluation.getStatut(),
                sessionEvaluation.getAnalyseCode() == null ? null : sessionEvaluation.getAnalyseCode().getId(),
                sessionEvaluation.getQuestions().stream().map(question -> question.getId()).toList(),
                sessionEvaluation.getMiseEnSituation() == null ? null : sessionEvaluation.getMiseEnSituation().getId(),
                sessionEvaluation.getEvaluation() == null ? null : sessionEvaluation.getEvaluation().getId()
        );
    }
}
