package youcode.ma.SkillCheckAI.dto.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ExigenceResponse {

    private Long id;
    private String titre;
    private String description;
    private boolean obligatoire;
    private Long cahierDesChargesId;
}
