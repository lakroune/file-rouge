package youcode.ma.SkillCheckAI.mappers;

import youcode.ma.SkillCheckAI.dto.responses.ReponseResponse;
import youcode.ma.SkillCheckAI.entities.Reponse;

public final class ReponseMapper {

    private ReponseMapper() {
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
