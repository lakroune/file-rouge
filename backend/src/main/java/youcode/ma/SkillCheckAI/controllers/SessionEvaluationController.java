package youcode.ma.SkillCheckAI.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
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
import youcode.ma.SkillCheckAI.dto.requests.SessionEvaluationRequest;
import youcode.ma.SkillCheckAI.dto.responses.SessionEvaluationResponse;
import youcode.ma.SkillCheckAI.enums.StatutSession;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
@Tag(name = "Sessions d'évaluation", description = "Gestion des sessions d'évaluation")
public class SessionEvaluationController {

    @PostMapping("/analyses/{analyseId}/sessions")
    @Operation(summary = "Créer une session d'évaluation")
    public void create(
            @PathVariable Long analyseId,
            @Valid @RequestBody SessionEvaluationRequest request
    ) {
    }

    @GetMapping("/sessions")
    @Operation(summary = "Lister les sessions avec pagination")
    public Page<SessionEvaluationResponse> findAll(
            @RequestParam(required = false) StatutSession statut,
            Pageable pageable
    ) {
        return null;
    }

    @GetMapping("/sessions/{id}")
    @Operation(summary = "Consulter une session")
    public SessionEvaluationResponse findById(@PathVariable Long id) {
        return null;
    }

    @GetMapping("/analyses/{analyseId}/sessions")
    @Operation(summary = "Lister les sessions d'une analyse")
    public List<SessionEvaluationResponse> findByAnalyseId(@PathVariable Long analyseId) {
        return null;
    }

    @GetMapping("/apprenants/{apprenantId}/sessions")
    @Operation(summary = "Lister les sessions d'un apprenant")
    public List<SessionEvaluationResponse> findByApprenantId(@PathVariable Long apprenantId) {
        return null;
    }

    @GetMapping("/projets/{projetId}/sessions")
    @Operation(summary = "Lister les sessions d'un projet")
    public List<SessionEvaluationResponse> findByProjetId(@PathVariable Long projetId) {
        return null;
    }

    @PatchMapping("/sessions/{id}/demarrer")
    @Operation(summary = "Démarrer une session")
    public void start(@PathVariable Long id) {
    }

    @PatchMapping("/sessions/{id}/terminer")
    @Operation(summary = "Terminer une session")
    public void finish(@PathVariable Long id) {
    }

    @PatchMapping("/sessions/{id}/annuler")
    @Operation(summary = "Annuler une session")
    public void cancel(@PathVariable Long id) {
    }

    @PostMapping("/sessions/{id}/generer-questions")
    @Operation(summary = "Générer les questions avec DeepSeek")
    public void generateQuestions(@PathVariable Long id) {
    }

    @PostMapping("/sessions/{id}/generer-mise-en-situation")
    @Operation(summary = "Générer une mise en situation")
    public void generateMiseEnSituation(@PathVariable Long id) {
    }

    @GetMapping("/sessions/{id}/progression")
    @Operation(summary = "Consulter la progression de l'apprenant")
    public Map<String, Object> progression(@PathVariable Long id) {
        return null;
    }
}
