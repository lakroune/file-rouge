package youcode.ma.SkillCheckAI.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import youcode.ma.SkillCheckAI.enums.Niveau;

import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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

    @OneToMany(mappedBy = "apprenant", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Livrable> livrables = new ArrayList<>();

    @ManyToOne(optional = false)
    @JoinColumn(name = "promotion_id", nullable = false)
    private Promotion promotion;

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
