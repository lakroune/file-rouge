package youcode.ma.SkillCheckAI.dto.requests;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import youcode.ma.SkillCheckAI.enums.StatutSession;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SessionEvaluationRequest {

    private LocalDateTime dateFin;

    @NotNull
    private StatutSession statut;

    @NotNull
    private Long analyseCodeId;

    private Long miseEnSituationId;

    private Long evaluationId;
}
