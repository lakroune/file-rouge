package youcode.ma.SkillCheckAI.dto.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SolutionRequest {

    @NotBlank
    private String contenu;

    private BigDecimal note;

    private String feedback;

    @NotNull
    private Long miseEnSituationId;
}
