package youcode.ma.SkillCheckAI.mappers;

import youcode.ma.SkillCheckAI.dto.responses.UtilisateurResponse;
import youcode.ma.SkillCheckAI.entities.Utilisateur;

public final class UtilisateurMapper {

    private UtilisateurMapper() {
    }

    public static UtilisateurResponse toResponse(Utilisateur utilisateur) {
        if (utilisateur == null) {
            return null;
        }
        return new UtilisateurResponse(
                utilisateur.getId(),
                utilisateur.getNom(),
                utilisateur.getPrenom(),
                utilisateur.getEmail(),
                utilisateur.getDateCreation()
        );
    }
}
