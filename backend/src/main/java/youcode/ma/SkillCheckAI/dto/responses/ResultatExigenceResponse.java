package youcode.ma.SkillCheckAI.dto.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import youcode.ma.SkillCheckAI.enums.StatutExigence;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResultatExigenceResponse {

    private Long id;
    private StatutExigence statut;
    private String justification;
    private String preuve;
    private Long analyseCodeId;
    private Long exigenceId;
}
