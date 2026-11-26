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
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import youcode.ma.SkillCheckAI.enums.StatutAnalyse;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "analyses_code")
@Getter
@Setter
@NoArgsConstructor
public class AnalyseCode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, updatable = false)
    private LocalDateTime dateAnalyse;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private StatutAnalyse statut;

    @Column(columnDefinition = "TEXT")
    private String rapport;

    @ManyToOne(optional = false)
    @JoinColumn(name = "livrable_id", nullable = false)
    private Livrable livrable;

    @OneToMany(mappedBy = "analyseCode")
    private List<ResultatExigence> resultatsExigence = new ArrayList<>();

    @OneToMany(mappedBy = "analyseCode")
    private List<SessionEvaluation> sessionsEvaluation = new ArrayList<>();

    public AnalyseCode(StatutAnalyse statut, String rapport) {
        this.statut = statut;
        this.rapport = rapport;
    }

    @PrePersist
    protected void initialiserDateAnalyse() {
        if (dateAnalyse == null) {
            dateAnalyse = LocalDateTime.now();
        }
    }
}
