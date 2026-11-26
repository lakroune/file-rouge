package youcode.ma.SkillCheckAI.dto.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import youcode.ma.SkillCheckAI.enums.StatutProjet;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProjetResponse {

    private Long id;
    private String titre;
    private String description;
    private LocalDateTime dateCreation;
    private LocalDate dateDebut;
    private LocalDate dateLimite;
    private StatutProjet statut;
    private Long formateurId;
    private Long cahierDesChargesId;
    private List<Long> livrableIds;
    private List<Long> promotionIds;
    private List<Long> competenceIds;
}
