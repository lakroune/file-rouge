package youcode.ma.SkillCheckAI.mappers;

import youcode.ma.SkillCheckAI.dto.requests.AnalyseCodeRequest;
import youcode.ma.SkillCheckAI.dto.responses.AnalyseCodeResponse;
import youcode.ma.SkillCheckAI.entities.AnalyseCode;
import youcode.ma.SkillCheckAI.entities.Livrable;

public final class AnalyseCodeMapper {

    private AnalyseCodeMapper() {
    }

    public static AnalyseCode toEntity(AnalyseCodeRequest request, Livrable livrable) {
        if (request == null) {
            return null;
        }
        AnalyseCode analyseCode = new AnalyseCode(request.getStatut(), request.getRapport());
        analyseCode.setLivrable(livrable);
        return analyseCode;
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
