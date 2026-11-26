package youcode.ma.SkillCheckAI.mappers;

import youcode.ma.SkillCheckAI.dto.responses.CompetenceResponse;
import youcode.ma.SkillCheckAI.entities.Competence;

public final class CompetenceMapper {

    private CompetenceMapper() {
    }

    public static CompetenceResponse toResponse(Competence competence) {
        if (competence == null) {
            return null;
        }
        return new CompetenceResponse(
                competence.getId(),
                competence.getNom(),
                competence.getDescription(),
                competence.getProjets().stream().map(projet -> projet.getId()).toList(),
                competence.getQuestions().stream().map(question -> question.getId()).toList(),
                competence.getMisesEnSituation().stream().map(mise -> mise.getId()).toList()
        );
    }
}
