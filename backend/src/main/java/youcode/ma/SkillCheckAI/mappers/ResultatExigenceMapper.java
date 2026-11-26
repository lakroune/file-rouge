package youcode.ma.SkillCheckAI.mappers;

import youcode.ma.SkillCheckAI.dto.responses.ResultatExigenceResponse;
import youcode.ma.SkillCheckAI.entities.ResultatExigence;

public final class ResultatExigenceMapper {

    private ResultatExigenceMapper() {
    }

    public static ResultatExigenceResponse toResponse(ResultatExigence resultatExigence) {
        if (resultatExigence == null) {
            return null;
        }
        return new ResultatExigenceResponse(
                resultatExigence.getId(),
                resultatExigence.getStatut(),
                resultatExigence.getJustification(),
                resultatExigence.getPreuve(),
                resultatExigence.getAnalyseCode() == null ? null : resultatExigence.getAnalyseCode().getId(),
                resultatExigence.getExigence() == null ? null : resultatExigence.getExigence().getId()
        );
    }
}
