package youcode.ma.SkillCheckAI.dto.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import youcode.ma.SkillCheckAI.enums.StatutProjet;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProjetRequest {

    @NotBlank
    private String titre;

    @NotBlank
    private String description;

    @NotNull
    private LocalDate dateDebut;

    @NotNull
    private LocalDate dateLimite;

    @NotNull
    private StatutProjet statut;

    @NotNull
    private Long formateurId;

    private Long cahierDesChargesId;

    private List<Long> promotionIds;

    private List<Long> competenceIds;
}
