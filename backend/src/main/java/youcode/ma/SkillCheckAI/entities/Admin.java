package youcode.ma.SkillCheckAI.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "admins")
@PrimaryKeyJoinColumn(name = "id")
@Getter
@NoArgsConstructor
public class Admin extends Utilisateur {

    public Admin(String nom, String prenom, String email, String password) {
        super(nom, prenom, email, password);
    }
}
