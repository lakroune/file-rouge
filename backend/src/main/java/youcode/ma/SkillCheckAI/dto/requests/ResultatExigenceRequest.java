package youcode.ma.SkillCheckAI.dto.requests;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import youcode.ma.SkillCheckAI.enums.StatutExigence;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResultatExigenceRequest {

    @NotNull
    private StatutExigence statut;

    private String justification;

    private String preuve;

    @NotNull
    private Long analyseCodeId;

    @NotNull
    private Long exigenceId;
}
