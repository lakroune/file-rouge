package youcode.ma.SkillCheckAI.dto.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import youcode.ma.SkillCheckAI.enums.StatutSession;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SessionEvaluationResponse {

    private Long id;
    private LocalDateTime dateDebut;
    private LocalDateTime dateFin;
    private StatutSession statut;
    private Long analyseCodeId;
    private List<Long> questionIds;
    private Long miseEnSituationId;
    private Long evaluationId;
}
