package youcode.ma.SkillCheckAI.mappers;

import youcode.ma.SkillCheckAI.dto.requests.CahierDesChargesRequest;
import youcode.ma.SkillCheckAI.dto.responses.CahierDesChargesResponse;
import youcode.ma.SkillCheckAI.entities.CahierDesCharges;
import youcode.ma.SkillCheckAI.entities.Projet;

public final class CahierDesChargesMapper {

    private CahierDesChargesMapper() {
    }

    public static CahierDesCharges toEntity(CahierDesChargesRequest request, Projet projet) {
        if (request == null) {
            return null;
        }
        CahierDesCharges cahierDesCharges = new CahierDesCharges(request.getTitre(), request.getContenu());
        cahierDesCharges.setProjet(projet);
        return cahierDesCharges;
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
