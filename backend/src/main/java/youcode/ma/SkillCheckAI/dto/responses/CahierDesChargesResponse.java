package youcode.ma.SkillCheckAI.dto.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CahierDesChargesResponse {

    private Long id;
    private String titre;
    private String contenu;
    private LocalDateTime dateCreation;
    private Long projetId;
}
