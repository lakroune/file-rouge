package youcode.ma.SkillCheckAI.mappers;

import youcode.ma.SkillCheckAI.dto.requests.SolutionRequest;
import youcode.ma.SkillCheckAI.dto.responses.SolutionResponse;
import youcode.ma.SkillCheckAI.entities.Solution;
import youcode.ma.SkillCheckAI.entities.MiseEnSituation;

public final class SolutionMapper {

    private SolutionMapper() {
    }

    public static Solution toEntity(SolutionRequest request, MiseEnSituation miseEnSituation) {
        if (request == null) {
            return null;
        }
        Solution solution = new Solution(request.getContenu(), request.getNote(), request.getFeedback());
        solution.setMiseEnSituation(miseEnSituation);
        return solution;
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
