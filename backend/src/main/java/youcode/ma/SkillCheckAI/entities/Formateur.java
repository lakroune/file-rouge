package youcode.ma.SkillCheckAI.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "formateurs")
@PrimaryKeyJoinColumn(name = "id")
@Getter
@Setter
@NoArgsConstructor
public class Formateur extends Utilisateur {

    private String specialite;

    @OneToMany(mappedBy = "formateur")
    private List<Projet> projets = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "formateurs_promotions",
            joinColumns = @JoinColumn(name = "formateur_id"),
            inverseJoinColumns = @JoinColumn(name = "promotion_id")
    )
    private List<Promotion> promotions = new ArrayList<>();

    public Formateur(String nom, String prenom, String email, String password, String specialite) {
        super(nom, prenom, email, password);
        this.specialite = specialite;
    }
}
