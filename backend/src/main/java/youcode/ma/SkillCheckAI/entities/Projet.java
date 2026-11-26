package youcode.ma.SkillCheckAI.entities;

import jakarta.persistence.Column;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import youcode.ma.SkillCheckAI.enums.StatutProjet;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "projets")
@Getter
@Setter
@NoArgsConstructor
public class Projet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titre;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String description;

    @Column(nullable = false, updatable = false)
    private LocalDateTime dateCreation;

    private LocalDate dateDebut;

    private LocalDate dateLimite;

    @Enumerated(EnumType.STRING)
    private StatutProjet statut;

    @ManyToOne(
            optional = false,
            cascade = {CascadeType.PERSIST, CascadeType.MERGE}
    )
    @JoinColumn(name = "formateur_id", nullable = false)
    private Formateur formateur;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "cahier_des_charges_id", unique = true)
    private CahierDesCharges cahierDesCharges;

    @OneToMany(mappedBy = "projet")
    private List<Livrable> livrables = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "projets_promotions",
            joinColumns = @JoinColumn(name = "projet_id"),
            inverseJoinColumns = @JoinColumn(name = "promotion_id")
    )
    private List<Promotion> promotions = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "projets_competences",
            joinColumns = @JoinColumn(name = "projet_id"),
            inverseJoinColumns = @JoinColumn(name = "competence_id")
    )
    private List<Competence> competences = new ArrayList<>();

    public Projet(
            String titre,
            String description,
            LocalDate dateDebut,
            LocalDate dateLimite,
            StatutProjet statut
    ) {
        this.titre = titre;
        this.description = description;
        this.dateDebut = dateDebut;
        this.dateLimite = dateLimite;
        this.statut = statut;
    }

    @PrePersist
    protected void initialiserDateCreation() {
        if (dateCreation == null) {
            dateCreation = LocalDateTime.now();
        }
    }
}
