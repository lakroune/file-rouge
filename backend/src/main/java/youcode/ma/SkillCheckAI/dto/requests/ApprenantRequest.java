package youcode.ma.SkillCheckAI.dto.requests;

import java.time.LocalDate;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import youcode.ma.SkillCheckAI.enums.Niveau;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ApprenantRequest {

    @NotBlank
    private String nom;

    @NotBlank
    private String prenom;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    private String password;

    @NotBlank
    private String matricule;

    @NotNull
    private LocalDate dateInscription;

    @NotNull
    private Niveau niveau;
}
