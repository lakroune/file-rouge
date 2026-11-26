package youcode.ma.SkillCheckAI.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

 
@Entity
@Table(name = "utilisateurs")
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @Column(nullable = false)
    @Setter
    protected String nom;

    @Column(nullable = false)
    @Setter
    protected String prenom;

    @Column(nullable = false, unique = true)
    @Setter
    protected String email;

    @Column(nullable = false)
    @Setter
    protected String password;

    @Column(nullable = false, updatable = false)
    protected LocalDateTime dateCreation;

    protected Utilisateur(String nom, String prenom, String email, String password) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.password = password;
    }

    @PrePersist
    protected void initialiserDateCreation() {
        if (dateCreation == null) {
            dateCreation = LocalDateTime.now();
        }
    }

}
