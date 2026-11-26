package youcode.ma.SkillCheckAI.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import youcode.ma.SkillCheckAI.enums.Niveau;

import java.time.LocalDate;

@Entity
@Table(name = "apprenants")
@PrimaryKeyJoinColumn(name = "id")
@Getter
@Setter
@NoArgsConstructor
public class Apprenant extends Utilisateur {

    private String matricule;

    private LocalDate dateInscription;

    @Enumerated(EnumType.STRING)
    private Niveau niveau;

    public Apprenant(
            String nom,
            String prenom,
            String email,
            String password,
            String matricule,
            LocalDate dateInscription,
            Niveau niveau
    ) {
        super(nom, prenom, email, password);
        this.matricule = matricule;
        this.dateInscription = dateInscription;
        this.niveau = niveau;
    }
}
