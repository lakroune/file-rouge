package youcode.ma.SkillCheckAI.dto.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import youcode.ma.SkillCheckAI.enums.Niveau;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ApprenantResponse {

    private Long id;
    private String nom;
    private String prenom;
    private String email;
    private LocalDateTime dateCreation;
    private String matricule;
    private LocalDate dateInscription;
    private Niveau niveau;
    private Long promotionId;
}
