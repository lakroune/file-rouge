package youcode.ma.SkillCheckAI.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import youcode.ma.SkillCheckAI.enums.StatutSession;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "sessions_evaluation")
@Getter
@Setter
@NoArgsConstructor
public class SessionEvaluation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, updatable = false)
    private LocalDateTime dateDebut;

    private LocalDateTime dateFin;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private StatutSession statut;

    @ManyToOne(optional = false)
    @JoinColumn(name = "analyse_code_id", nullable = false)
    private AnalyseCode analyseCode;

    @OneToMany(mappedBy = "sessionEvaluation")
    private List<Question> questions = new ArrayList<>();

    @OneToOne
    @JoinColumn(name = "mise_en_situation_id", unique = true)
    private MiseEnSituation miseEnSituation;

    @OneToOne
    @JoinColumn(name = "evaluation_id", unique = true)
    private Evaluation evaluation;

    public SessionEvaluation(StatutSession statut) {
        this.statut = statut;
    }

    @PrePersist
    protected void initialiserDateDebut() {
        if (dateDebut == null) {
            dateDebut = LocalDateTime.now();
        }
    }
}
