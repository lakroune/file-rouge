package youcode.ma.SkillCheckAI.mappers;

import youcode.ma.SkillCheckAI.dto.responses.ExigenceResponse;
import youcode.ma.SkillCheckAI.entities.Exigence;

public final class ExigenceMapper {

    private ExigenceMapper() {
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
