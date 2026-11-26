package youcode.ma.SkillCheckAI.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "reponses")
@Getter
@Setter
@NoArgsConstructor
public class Reponse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String contenu;

    @Column(nullable = false, updatable = false)
    private LocalDateTime dateReponse;

    @Column(precision = 10, scale = 2)
    private BigDecimal note;

    @Column(columnDefinition = "TEXT")
    private String feedback;

    public Reponse(String contenu, BigDecimal note, String feedback) {
        this.contenu = contenu;
        this.note = note;
        this.feedback = feedback;
    }

    @PrePersist
    protected void initialiserDateReponse() {
        if (dateReponse == null) {
            dateReponse = LocalDateTime.now();
        }
    }
}
