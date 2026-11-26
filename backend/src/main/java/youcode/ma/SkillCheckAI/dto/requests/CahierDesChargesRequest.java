package youcode.ma.SkillCheckAI.dto.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CahierDesChargesRequest {

    @NotBlank
    private String titre;

    @NotBlank
    private String contenu;

    @NotNull
    private Long projetId;
}
