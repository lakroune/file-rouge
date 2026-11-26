package youcode.ma.SkillCheckAI.mappers;

import youcode.ma.SkillCheckAI.dto.responses.QuestionResponse;
import youcode.ma.SkillCheckAI.entities.Question;

public final class QuestionMapper {

    private QuestionMapper() {
    }

    public static QuestionResponse toResponse(Question question) {
        if (question == null) {
            return null;
        }
        return new QuestionResponse(
                question.getId(),
                question.getEnonce(),
                question.getDifficulte(),
                question.getOrdre(),
                question.getBareme(),
                question.getSessionEvaluation() == null ? null : question.getSessionEvaluation().getId(),
                question.getReponse() == null ? null : question.getReponse().getId(),
                question.getCompetences().stream().map(competence -> competence.getId()).toList()
        );
    }
}
