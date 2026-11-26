package youcode.ma.SkillCheckAI.dto.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import youcode.ma.SkillCheckAI.enums.StatutLivrable;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LivrableResponse {

    private Long id;
    private String urlGithub;
    private String commitHash;
    private LocalDateTime dateSoumission;
    private StatutLivrable statut;
    private Long apprenantId;
    private Long projetId;
    private List<Long> analyseCodeIds;
}
