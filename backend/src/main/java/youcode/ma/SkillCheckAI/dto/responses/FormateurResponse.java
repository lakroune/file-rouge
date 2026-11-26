package youcode.ma.SkillCheckAI.dto.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FormateurResponse {

    private Long id;
    private String nom;
    private String prenom;
    private String email;
    private LocalDateTime dateCreation;
    private String specialite;
    private List<Long> projetIds;
    private List<Long> promotionIds;
    private List<Long> evaluationIds;
}
