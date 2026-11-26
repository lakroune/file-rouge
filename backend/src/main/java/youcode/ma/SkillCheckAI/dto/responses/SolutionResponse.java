package youcode.ma.SkillCheckAI.dto.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SolutionResponse {

    private Long id;
    private String contenu;
    private LocalDateTime dateSoumission;
    private BigDecimal note;
    private String feedback;
    private Long miseEnSituationId;
}
