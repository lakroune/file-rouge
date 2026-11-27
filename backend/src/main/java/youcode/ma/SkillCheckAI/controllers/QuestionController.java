package youcode.ma.SkillCheckAI.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import youcode.ma.SkillCheckAI.dto.requests.QuestionRequest;
import youcode.ma.SkillCheckAI.dto.responses.CompetenceResponse;
import youcode.ma.SkillCheckAI.dto.responses.QuestionResponse;
import youcode.ma.SkillCheckAI.enums.Difficulte;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
@Tag(name = "Questions", description = "Gestion des questions")
public class QuestionController {

    @PostMapping("/sessions/{sessionId}/questions")
    @Operation(summary = "Ajouter manuellement une question")
    public void create(
            @PathVariable Long sessionId,
            @Valid @RequestBody QuestionRequest request
    ) {
    }

    @GetMapping("/questions")
    @Operation(summary = "Lister les questions avec pagination")
    public Page<QuestionResponse> findAll(Pageable pageable) {
        return null;
    }

    @GetMapping("/questions/{id}")
    @Operation(summary = "Consulter une question")
    public QuestionResponse findById(@PathVariable Long id) {
        return null;
    }

    @PutMapping("/questions/{id}")
    @Operation(summary = "Modifier une question")
    public void update(
            @PathVariable Long id,
            @Valid @RequestBody QuestionRequest request
    ) {
    }

    @DeleteMapping("/questions/{id}")
    @Operation(summary = "Supprimer une question")
    public void delete(@PathVariable Long id) {
    }

    @GetMapping("/sessions/{sessionId}/questions")
    @Operation(summary = "Lister les questions d'une session")
    public List<QuestionResponse> findBySessionId(
            @PathVariable Long sessionId,
            @RequestParam(required = false) Difficulte difficulte
    ) {
        return null;
    }

    @GetMapping("/sessions/{sessionId}/questions/next")
    @Operation(summary = "Récupérer la prochaine question sans réponse")
    public QuestionResponse findNext(@PathVariable Long sessionId) {
        return null;
    }

    @GetMapping("/sessions/{sessionId}/questions/count")
    @Operation(summary = "Compter les questions")
    public long count(@PathVariable Long sessionId) {
        return 0L;
    }

    @PostMapping("/questions/{id}/competences/{competenceId}")
    @Operation(summary = "Associer une compétence à une question")
    public void addCompetence(
            @PathVariable Long id,
            @PathVariable Long competenceId
    ) {
    }

    @DeleteMapping("/questions/{id}/competences/{competenceId}")
    @Operation(summary = "Retirer une compétence")
    public void removeCompetence(
            @PathVariable Long id,
            @PathVariable Long competenceId
    ) {
    }

    @GetMapping("/questions/{id}/competences")
    @Operation(summary = "Lister les compétences évaluées")
    public List<CompetenceResponse> findCompetences(@PathVariable Long id) {
        return null;
    }

    @PatchMapping("/questions/{id}/ordre")
    @Operation(summary = "Modifier l'ordre d'une question")
    public void updateOrder(
            @PathVariable Long id,
            @RequestBody Integer ordre
    ) {
    }

    @PatchMapping("/questions/{id}/bareme")
    @Operation(summary = "Modifier le barème")
    public void updateScore(
            @PathVariable Long id,
            @RequestBody BigDecimal bareme
    ) {
    }
}
