package youcode.ma.SkillCheckAI.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "promotions")
@Getter
@Setter
@NoArgsConstructor
public class Promotion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nom;

    private LocalDate dateDebut;

    private LocalDate dateFin;

    @ManyToMany(mappedBy = "promotions")
    private List<Formateur> formateurs = new ArrayList<>();

    @OneToMany(mappedBy = "promotion")
    private List<Apprenant> apprenants = new ArrayList<>();

    @ManyToMany(mappedBy = "promotions")
    private List<Projet> projets = new ArrayList<>();

    public Promotion(String nom, LocalDate dateDebut, LocalDate dateFin) {
        this.nom = nom;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }
}
