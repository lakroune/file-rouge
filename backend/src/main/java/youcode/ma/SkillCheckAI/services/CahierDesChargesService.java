package youcode.ma.SkillCheckAI.services;

import youcode.ma.SkillCheckAI.dto.requests.CahierDesChargesRequest;
import youcode.ma.SkillCheckAI.dto.responses.CahierDesChargesResponse;

public interface CahierDesChargesService {

    CahierDesChargesResponse create(CahierDesChargesRequest request);
}
