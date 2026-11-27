package youcode.ma.SkillCheckAI.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import youcode.ma.SkillCheckAI.dto.responses.EvaluationResponse;
import youcode.ma.SkillCheckAI.enums.StatutEvaluation;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
@Tag(name = "Évaluations", description = "Gestion des évaluations")
public class EvaluationController {

    @PostMapping("/sessions/{sessionId}/evaluation")
    @Operation(summary = "Générer l'évaluation finale avec DeepSeek")
    public void create(@PathVariable Long sessionId) {
    }

    @GetMapping("/evaluations")
    @Operation(summary = "Lister les évaluations avec pagination")
    public Page<EvaluationResponse> findAll(
            @RequestParam(required = false) StatutEvaluation statut,
            Pageable pageable
    ) {
        return null;
    }

    @GetMapping("/evaluations/{id}")
    @Operation(summary = "Consulter une évaluation")
    public EvaluationResponse findById(@PathVariable Long id) {
        return null;
    }

    @GetMapping("/sessions/{sessionId}/evaluation")
    @Operation(summary = "Consulter l'évaluation d'une session")
    public EvaluationResponse findBySessionId(@PathVariable Long sessionId) {
        return null;
    }

    @GetMapping("/apprenants/{apprenantId}/evaluations")
    @Operation(summary = "Lister les évaluations d'un apprenant")
    public List<EvaluationResponse> findByApprenantId(@PathVariable Long apprenantId) {
        return null;
    }

    @GetMapping("/projets/{projetId}/evaluations")
    @Operation(summary = "Lister les évaluations d'un projet")
    public List<EvaluationResponse> findByProjetId(@PathVariable Long projetId) {
        return null;
    }

    @GetMapping("/formateurs/{formateurId}/evaluations")
    @Operation(summary = "Lister les évaluations d'un formateur")
    public List<EvaluationResponse> findByFormateurId(@PathVariable Long formateurId) {
        return null;
    }

    @PatchMapping("/evaluations/{id}/valider")
    @Operation(summary = "Valider une évaluation par le formateur")
    public void validate(@PathVariable Long id) {
    }

    @PatchMapping("/evaluations/{id}/rejeter")
    @Operation(summary = "Rejeter une évaluation")
    public void reject(@PathVariable Long id) {
    }

    @PatchMapping("/evaluations/{id}/commentaire")
    @Operation(summary = "Ajouter ou modifier le commentaire du formateur")
    public void updateComment(
            @PathVariable Long id,
            @RequestBody String commentaireFormateur
    ) {
    }

    @PatchMapping("/evaluations/{id}/note")
    @Operation(summary = "Corriger la note globale")
    public void updateScore(
            @PathVariable Long id,
            @RequestBody BigDecimal noteGlobale
    ) {
    }

    @GetMapping("/evaluations/{id}/feedback")
    @Operation(summary = "Consulter le feedback de l'IA")
    public String findFeedback(@PathVariable Long id) {
        return null;
    }

    @GetMapping("/evaluations/{id}/rapport")
    @Operation(summary = "Consulter le rapport final")
    public String findReport(@PathVariable Long id) {
        return null;
    }

    @GetMapping("/evaluations/{id}/export/pdf")
    @Operation(summary = "Exporter l'évaluation en PDF")
    public byte[] exportPdf(@PathVariable Long id) {
        return null;
    }

    @GetMapping("/projets/{projetId}/evaluations/statistiques")
    @Operation(summary = "Consulter les statistiques des évaluations")
    public Map<String, Object> statistics(@PathVariable Long projetId) {
        return null;
    }
}
