package youcode.ma.SkillCheckAI.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import youcode.ma.SkillCheckAI.enums.StatutEvaluation;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "evaluations")
@Getter
@Setter
@NoArgsConstructor
public class Evaluation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(precision = 10, scale = 2)
    private BigDecimal noteGlobale;

    @Column(columnDefinition = "TEXT")
    private String feedbackIA;

    @Column(columnDefinition = "TEXT")
    private String commentaireFormateur;

    @Column(nullable = false, updatable = false)
    private LocalDateTime dateEvaluation;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private StatutEvaluation statut;

    public Evaluation(
            BigDecimal noteGlobale,
            String feedbackIA,
            String commentaireFormateur,
            StatutEvaluation statut
    ) {
        this.noteGlobale = noteGlobale;
        this.feedbackIA = feedbackIA;
        this.commentaireFormateur = commentaireFormateur;
        this.statut = statut;
    }

    @PrePersist
    protected void initialiserDateEvaluation() {
        if (dateEvaluation == null) {
            dateEvaluation = LocalDateTime.now();
        }
    }
}
