package youcode.ma.SkillCheckAI.dto.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import youcode.ma.SkillCheckAI.enums.Difficulte;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class QuestionRequest {

    @NotBlank
    private String enonce;

    @NotNull
    private Difficulte difficulte;

    @NotNull
    private Integer ordre;

    @NotNull
    private BigDecimal bareme;

    @NotNull
    private Long sessionEvaluationId;

    private List<Long> competenceIds;
}
