package youcode.ma.SkillCheckAI.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "formateurs")
@PrimaryKeyJoinColumn(name = "id")
@Getter
@Setter
@NoArgsConstructor
public class Formateur extends Utilisateur {

    private String specialite;

    public Formateur(String nom, String prenom, String email, String password, String specialite) {
        super(nom, prenom, email, password);
        this.specialite = specialite;
    }
}
