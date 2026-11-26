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
public class ExigenceRequest {

    @NotBlank
    private String titre;

    @NotBlank
    private String description;

    private boolean obligatoire;

    @NotNull
    private Long cahierDesChargesId;
}
