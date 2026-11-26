package youcode.ma.SkillCheckAI.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import youcode.ma.SkillCheckAI.enums.StatutLivrable;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "livrables")
@Getter
@Setter
@NoArgsConstructor
public class Livrable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String urlGithub;

    private String commitHash;

    private LocalDateTime dateSoumission;

    @Enumerated(EnumType.STRING)
    private StatutLivrable statut;

    @ManyToOne(optional = false)
    private Apprenant apprenant;

    @ManyToOne(optional = false)
    @JoinColumn(name = "projet_id", nullable = false)
    private Projet projet;

    @OneToMany(mappedBy = "livrable")
    private List<AnalyseCode> analysesCode = new ArrayList<>();

    public Livrable(
            String urlGithub,
            String commitHash,
            LocalDateTime dateSoumission,
            StatutLivrable statut,
            Apprenant apprenant
    ) {
        this.urlGithub = urlGithub;
        this.commitHash = commitHash;
        this.dateSoumission = dateSoumission;
        this.statut = statut;
        this.apprenant = apprenant;
    }
}
