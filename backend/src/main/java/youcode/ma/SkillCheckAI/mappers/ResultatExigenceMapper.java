package youcode.ma.SkillCheckAI.mappers;

import youcode.ma.SkillCheckAI.dto.requests.ResultatExigenceRequest;
import youcode.ma.SkillCheckAI.dto.responses.ResultatExigenceResponse;
import youcode.ma.SkillCheckAI.entities.AnalyseCode;
import youcode.ma.SkillCheckAI.entities.Exigence;
import youcode.ma.SkillCheckAI.entities.ResultatExigence;

public final class ResultatExigenceMapper {

    private ResultatExigenceMapper() {
    }

    public static ResultatExigence toEntity(
            ResultatExigenceRequest request,
            AnalyseCode analyseCode,
            Exigence exigence
    ) {
        if (request == null) {
            return null;
        }
        ResultatExigence resultatExigence = new ResultatExigence(
                request.getStatut(),
                request.getJustification(),
                request.getPreuve()
        );
        resultatExigence.setAnalyseCode(analyseCode);
        resultatExigence.setExigence(exigence);
        return resultatExigence;
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
