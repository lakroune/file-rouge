package youcode.ma.SkillCheckAI.mappers;

import youcode.ma.SkillCheckAI.dto.responses.AnalyseCodeResponse;
import youcode.ma.SkillCheckAI.entities.AnalyseCode;

public final class AnalyseCodeMapper {

    private AnalyseCodeMapper() {
    }

    public static AnalyseCodeResponse toResponse(AnalyseCode analyseCode) {
        if (analyseCode == null) {
            return null;
        }
        return new AnalyseCodeResponse(
                analyseCode.getId(),
                analyseCode.getDateAnalyse(),
                analyseCode.getStatut(),
                analyseCode.getRapport(),
                analyseCode.getLivrable() == null ? null : analyseCode.getLivrable().getId()
        );
    }
}
