package youcode.ma.SkillCheckAI.dto.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import youcode.ma.SkillCheckAI.enums.StatutLivrable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LivrableRequest {

    @NotBlank
    private String urlGithub;

    @NotBlank
    private String commitHash;

    @NotNull
    private StatutLivrable statut;

    @NotNull
    private Long apprenantId;

    @NotNull
    private Long projetId;
}
