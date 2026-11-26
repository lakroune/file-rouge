package youcode.ma.SkillCheckAI.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import youcode.ma.SkillCheckAI.enums.StatutExigence;

@Entity
@Table(name = "resultats_exigences")
@Getter
@Setter
@NoArgsConstructor
public class ResultatExigence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private StatutExigence statut;

    private String justification;

    private String preuve;

    public ResultatExigence(
            StatutExigence statut,
            String justification,
            String preuve
    ) {
        this.statut = statut;
        this.justification = justification;
        this.preuve = preuve;
    }
}
