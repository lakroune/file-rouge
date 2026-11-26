package youcode.ma.SkillCheckAI.dto.requests;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import youcode.ma.SkillCheckAI.enums.StatutEvaluation;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EvaluationRequest {

    private BigDecimal noteGlobale;

    private String feedbackIA;

    private String commentaireFormateur;

    @NotNull
    private StatutEvaluation statut;

    private Long formateurId;
}
