package youcode.ma.SkillCheckAI.dto.responses;

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
public class QuestionResponse {

    private Long id;
    private String enonce;
    private Difficulte difficulte;
    private Integer ordre;
    private BigDecimal bareme;
    private Long sessionEvaluationId;
    private Long reponseId;
    private List<Long> competenceIds;
}
