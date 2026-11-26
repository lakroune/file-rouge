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
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import youcode.ma.SkillCheckAI.enums.Difficulte;

import java.math.BigDecimal;

@Entity
@Table(name = "questions")
@Getter
@Setter
@NoArgsConstructor
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String enonce;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Difficulte difficulte;

    @Column(nullable = false)
    private Integer ordre;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal bareme;

    @ManyToOne(optional = false)
    @JoinColumn(name = "session_evaluation_id", nullable = false)
    private SessionEvaluation sessionEvaluation;

    public Question(
            String enonce,
            Difficulte difficulte,
            Integer ordre,
            BigDecimal bareme
    ) {
        this.enonce = enonce;
        this.difficulte = difficulte;
        this.ordre = ordre;
        this.bareme = bareme;
    }
}
