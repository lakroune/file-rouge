package youcode.ma.SkillCheckAI.dto.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import youcode.ma.SkillCheckAI.enums.TypeMiseEnSituation;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MiseEnSituationResponse {

    private Long id;
    private String enonce;
    private TypeMiseEnSituation type;
    private BigDecimal bareme;
    private Long sessionEvaluationId;
    private Long solutionId;
    private List<Long> competenceIds;
}
