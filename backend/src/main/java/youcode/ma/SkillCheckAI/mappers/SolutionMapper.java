package youcode.ma.SkillCheckAI.mappers;

import youcode.ma.SkillCheckAI.dto.responses.SolutionResponse;
import youcode.ma.SkillCheckAI.entities.Solution;

public final class SolutionMapper {

    private SolutionMapper() {
    }

    public static SolutionResponse toResponse(Solution solution) {
        if (solution == null) {
            return null;
        }
        return new SolutionResponse(
                solution.getId(),
                solution.getContenu(),
                solution.getDateSoumission(),
                solution.getNote(),
                solution.getFeedback(),
                solution.getMiseEnSituation() == null ? null : solution.getMiseEnSituation().getId()
        );
    }
}
