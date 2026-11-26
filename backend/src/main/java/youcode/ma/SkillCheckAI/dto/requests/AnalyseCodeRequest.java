package youcode.ma.SkillCheckAI.dto.requests;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import youcode.ma.SkillCheckAI.enums.StatutAnalyse;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AnalyseCodeRequest {

    @NotNull
    private StatutAnalyse statut;

    private String rapport;

    @NotNull
    private Long livrableId;
}
