package youcode.ma.SkillCheckAI.mappers;

import youcode.ma.SkillCheckAI.dto.requests.ReponseRequest;
import youcode.ma.SkillCheckAI.dto.responses.ReponseResponse;
import youcode.ma.SkillCheckAI.entities.Question;
import youcode.ma.SkillCheckAI.entities.Reponse;

public final class ReponseMapper {

    private ReponseMapper() {
    }

    public static Reponse toEntity(ReponseRequest request, Question question) {
        if (request == null) {
            return null;
        }
        Reponse reponse = new Reponse(request.getContenu(), request.getNote(), request.getFeedback());
        reponse.setQuestion(question);
        return reponse;
    }

    public static ReponseResponse toResponse(Reponse reponse) {
        if (reponse == null) {
            return null;
        }
        return new ReponseResponse(
                reponse.getId(),
                reponse.getContenu(),
                reponse.getDateReponse(),
                reponse.getNote(),
                reponse.getFeedback(),
                reponse.getQuestion() == null ? null : reponse.getQuestion().getId()
        );
    }
}
