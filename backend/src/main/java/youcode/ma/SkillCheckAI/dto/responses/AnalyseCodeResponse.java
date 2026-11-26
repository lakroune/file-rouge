package youcode.ma.SkillCheckAI.dto.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import youcode.ma.SkillCheckAI.enums.StatutAnalyse;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AnalyseCodeResponse {

    private Long id;
    private LocalDateTime dateAnalyse;
    private StatutAnalyse statut;
    private String rapport;
    private Long livrableId;
}
