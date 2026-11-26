package youcode.ma.SkillCheckAI.mappers;

import youcode.ma.SkillCheckAI.dto.responses.EvaluationResponse;
import youcode.ma.SkillCheckAI.entities.Evaluation;

public final class EvaluationMapper {

    private EvaluationMapper() {
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
