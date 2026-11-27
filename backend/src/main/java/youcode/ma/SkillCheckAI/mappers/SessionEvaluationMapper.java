package youcode.ma.SkillCheckAI.mappers;

import youcode.ma.SkillCheckAI.dto.requests.SessionEvaluationRequest;
import youcode.ma.SkillCheckAI.dto.responses.SessionEvaluationResponse;
import youcode.ma.SkillCheckAI.entities.AnalyseCode;
import youcode.ma.SkillCheckAI.entities.Evaluation;
import youcode.ma.SkillCheckAI.entities.MiseEnSituation;
import youcode.ma.SkillCheckAI.entities.SessionEvaluation;

public final class SessionEvaluationMapper {

    private SessionEvaluationMapper() {
    }

    public static SessionEvaluation toEntity(
            SessionEvaluationRequest request,
            AnalyseCode analyseCode,
            MiseEnSituation miseEnSituation,
            Evaluation evaluation
    ) {
        if (request == null) {
            return null;
        }
        SessionEvaluation sessionEvaluation = new SessionEvaluation(request.getStatut());
        sessionEvaluation.setDateFin(request.getDateFin());
        sessionEvaluation.setAnalyseCode(analyseCode);
        sessionEvaluation.setMiseEnSituation(miseEnSituation);
        sessionEvaluation.setEvaluation(evaluation);
        return sessionEvaluation;
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
