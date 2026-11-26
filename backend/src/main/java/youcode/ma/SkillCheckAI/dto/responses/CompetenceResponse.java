package youcode.ma.SkillCheckAI.dto.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CompetenceResponse {

    private Long id;
    private String nom;
    private String description;
    private List<Long> projetIds;
    private List<Long> questionIds;
    private List<Long> miseEnSituationIds;
}
