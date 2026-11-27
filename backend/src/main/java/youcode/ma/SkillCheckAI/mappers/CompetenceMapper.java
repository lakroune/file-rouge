package youcode.ma.SkillCheckAI.mappers;

import java.util.List;

import youcode.ma.SkillCheckAI.dto.requests.CompetenceRequest;
import youcode.ma.SkillCheckAI.dto.responses.CompetenceResponse;
import youcode.ma.SkillCheckAI.entities.Competence;
import youcode.ma.SkillCheckAI.entities.MiseEnSituation;
import youcode.ma.SkillCheckAI.entities.Projet;
import youcode.ma.SkillCheckAI.entities.Question;

public final class CompetenceMapper {

    private CompetenceMapper() {
    }

    public static Competence toEntity(
            CompetenceRequest request,
            List<Projet> projets,
            List<Question> questions,
            List<MiseEnSituation> misesEnSituation
    ) {
        if (request == null) {
            return null;
        }
        Competence competence = new Competence(request.getNom(), request.getDescription());
        competence.setProjets(projets);
        competence.setQuestions(questions);
        competence.setMisesEnSituation(misesEnSituation);
        return competence;
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
