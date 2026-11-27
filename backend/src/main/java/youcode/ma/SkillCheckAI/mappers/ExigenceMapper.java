package youcode.ma.SkillCheckAI.mappers;

import youcode.ma.SkillCheckAI.dto.requests.ExigenceRequest;
import youcode.ma.SkillCheckAI.dto.responses.ExigenceResponse;
import youcode.ma.SkillCheckAI.entities.Exigence;
import youcode.ma.SkillCheckAI.entities.CahierDesCharges;

public final class ExigenceMapper {

    private ExigenceMapper() {
    }

    public static Exigence toEntity(ExigenceRequest request, CahierDesCharges cahierDesCharges) {
        if (request == null) {
            return null;
        }
        Exigence exigence = new Exigence(
                request.getTitre(),
                request.getDescription(),
                request.isObligatoire()
        );
        exigence.setCahierDesCharges(cahierDesCharges);
        return exigence;
    }

    public static ExigenceResponse toResponse(Exigence exigence) {
        if (exigence == null) {
            return null;
        }
        return new ExigenceResponse(
                exigence.getId(),
                exigence.getTitre(),
                exigence.getDescription(),
                exigence.isObligatoire(),
                exigence.getCahierDesCharges() == null ? null : exigence.getCahierDesCharges().getId()
        );
    }
}
