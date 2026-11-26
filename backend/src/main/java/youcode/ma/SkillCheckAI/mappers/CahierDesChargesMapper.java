package youcode.ma.SkillCheckAI.mappers;

import youcode.ma.SkillCheckAI.dto.responses.CahierDesChargesResponse;
import youcode.ma.SkillCheckAI.entities.CahierDesCharges;

public final class CahierDesChargesMapper {

    private CahierDesChargesMapper() {
    }

    public static CahierDesChargesResponse toResponse(CahierDesCharges cahierDesCharges) {
        if (cahierDesCharges == null) {
            return null;
        }
        return new CahierDesChargesResponse(
                cahierDesCharges.getId(),
                cahierDesCharges.getTitre(),
                cahierDesCharges.getContenu(),
                cahierDesCharges.getDateCreation(),
                cahierDesCharges.getProjet() == null ? null : cahierDesCharges.getProjet().getId()
        );
    }
}
