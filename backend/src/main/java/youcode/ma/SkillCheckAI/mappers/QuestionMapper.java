package youcode.ma.SkillCheckAI.mappers;

import java.util.List;

import youcode.ma.SkillCheckAI.dto.requests.QuestionRequest;
import youcode.ma.SkillCheckAI.dto.responses.QuestionResponse;
import youcode.ma.SkillCheckAI.entities.Competence;
import youcode.ma.SkillCheckAI.entities.Question;
import youcode.ma.SkillCheckAI.entities.SessionEvaluation;

public final class QuestionMapper {

    private QuestionMapper() {
    }

    public static Question toEntity(
            QuestionRequest request,
            SessionEvaluation sessionEvaluation,
            List<Competence> competences
    ) {
        if (request == null) {
            return null;
        }
        Question question = new Question(
                request.getEnonce(),
                request.getDifficulte(),
                request.getOrdre(),
                request.getBareme()
        );
        question.setSessionEvaluation(sessionEvaluation);
        question.setCompetences(competences);
        return question;
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
