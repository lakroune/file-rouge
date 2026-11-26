package youcode.ma.SkillCheckAI.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import youcode.ma.SkillCheckAI.enums.TypeMiseEnSituation;

import java.math.BigDecimal;

@Entity
@Table(name = "mises_en_situation")
@Getter
@Setter
@NoArgsConstructor
public class MiseEnSituation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String enonce;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TypeMiseEnSituation type;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal bareme;

    @OneToOne(mappedBy = "miseEnSituation")
    private SessionEvaluation sessionEvaluation;

    @OneToOne(mappedBy = "miseEnSituation")
    private Solution solution;

    public MiseEnSituation(String enonce, TypeMiseEnSituation type, BigDecimal bareme) {
        this.enonce = enonce;
        this.type = type;
        this.bareme = bareme;
    }
}
