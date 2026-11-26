package youcode.ma.SkillCheckAI.dto.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import youcode.ma.SkillCheckAI.enums.StatutEvaluation;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EvaluationResponse {

    private Long id;
    private BigDecimal noteGlobale;
    private String feedbackIA;
    private String commentaireFormateur;
    private LocalDateTime dateEvaluation;
    private StatutEvaluation statut;
    private Long sessionEvaluationId;
    private Long formateurId;
}
