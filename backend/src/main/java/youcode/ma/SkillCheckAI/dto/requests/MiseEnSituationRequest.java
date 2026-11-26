package youcode.ma.SkillCheckAI.dto.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import youcode.ma.SkillCheckAI.enums.TypeMiseEnSituation;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MiseEnSituationRequest {

    @NotBlank
    private String enonce;

    @NotNull
    private TypeMiseEnSituation type;

    @NotNull
    private BigDecimal bareme;

    private Long sessionEvaluationId;
}
