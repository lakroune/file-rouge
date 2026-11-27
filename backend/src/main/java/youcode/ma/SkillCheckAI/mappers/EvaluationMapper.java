package youcode.ma.SkillCheckAI.mappers;

import youcode.ma.SkillCheckAI.dto.requests.EvaluationRequest;
import youcode.ma.SkillCheckAI.dto.responses.EvaluationResponse;
import youcode.ma.SkillCheckAI.entities.Evaluation;
import youcode.ma.SkillCheckAI.entities.Formateur;
import youcode.ma.SkillCheckAI.entities.SessionEvaluation;

public final class EvaluationMapper {

    private EvaluationMapper() {
    }

    public static Evaluation toEntity(
            EvaluationRequest request,
            SessionEvaluation sessionEvaluation,
            Formateur formateur
    ) {
        if (request == null) {
            return null;
        }
        Evaluation evaluation = new Evaluation(
                request.getNoteGlobale(),
                request.getFeedbackIA(),
                request.getCommentaireFormateur(),
                request.getStatut()
        );
        evaluation.setSessionEvaluation(sessionEvaluation);
        evaluation.setFormateur(formateur);
        return evaluation;
    }

    public static EvaluationResponse toResponse(Evaluation evaluation) {
        if (evaluation == null) {
            return null;
        }
        return new EvaluationResponse(
                evaluation.getId(),
                evaluation.getNoteGlobale(),
                evaluation.getFeedbackIA(),
                evaluation.getCommentaireFormateur(),
                evaluation.getDateEvaluation(),
                evaluation.getStatut(),
                evaluation.getSessionEvaluation() == null ? null : evaluation.getSessionEvaluation().getId(),
                evaluation.getFormateur() == null ? null : evaluation.getFormateur().getId()
        );
    }
}
