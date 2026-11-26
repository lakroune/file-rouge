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
import youcode.ma.SkillCheckAI.enums.StatutSession;

import java.time.LocalDateTime;

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
