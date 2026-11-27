package youcode.ma.SkillCheckAI.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import youcode.ma.SkillCheckAI.dto.requests.ReponseRequest;
import youcode.ma.SkillCheckAI.dto.responses.ReponseResponse;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
@Tag(name = "Réponses", description = "Gestion des réponses")
public class ReponseController {

    @PostMapping("/questions/{questionId}/reponses")
    @Operation(summary = "Soumettre une réponse")
    public void create(
            @PathVariable Long questionId,
            @Valid @RequestBody ReponseRequest request
    ) {
    }

    @GetMapping("/reponses")
    @Operation(summary = "Lister les réponses avec pagination")
    public Page<ReponseResponse> findAll(Pageable pageable) {
        return null;
    }

    @GetMapping("/reponses/{id}")
    @Operation(summary = "Consulter une réponse")
    public ReponseResponse findById(@PathVariable Long id) {
        return null;
    }

    @PutMapping("/reponses/{id}")
    @Operation(summary = "Modifier une réponse avant son évaluation")
    public void update(
            @PathVariable Long id,
            @Valid @RequestBody ReponseRequest request
    ) {
    }

    @DeleteMapping("/reponses/{id}")
    @Operation(summary = "Supprimer une réponse avant son évaluation")
    public void delete(@PathVariable Long id) {
    }

    @GetMapping("/questions/{questionId}/reponse")
    @Operation(summary = "Consulter la réponse d'une question")
    public ReponseResponse findByQuestionId(@PathVariable Long questionId) {
        return null;
    }

    @GetMapping("/sessions/{sessionId}/reponses")
    @Operation(summary = "Lister les réponses d'une session")
    public List<ReponseResponse> findBySessionId(@PathVariable Long sessionId) {
        return null;
    }

    @GetMapping("/apprenants/{apprenantId}/reponses")
    @Operation(summary = "Lister les réponses d'un apprenant")
    public List<ReponseResponse> findByApprenantId(@PathVariable Long apprenantId) {
        return null;
    }

    @PostMapping("/reponses/{id}/evaluer")
    @Operation(summary = "Évaluer une réponse avec DeepSeek")
    public void evaluate(@PathVariable Long id) {
    }

    @GetMapping("/reponses/{id}/feedback")
    @Operation(summary = "Consulter le feedback de l'IA")
    public String findFeedback(@PathVariable Long id) {
        return null;
    }

    @GetMapping("/reponses/{id}/note")
    @Operation(summary = "Consulter la note obtenue")
    public BigDecimal findNote(@PathVariable Long id) {
        return null;
    }

    @GetMapping("/sessions/{sessionId}/reponses/count")
    @Operation(summary = "Compter les réponses soumises")
    public long count(@PathVariable Long sessionId) {
        return 0L;
    }

    @GetMapping("/sessions/{sessionId}/reponses/statistiques")
    @Operation(summary = "Consulter les statistiques des réponses")
    public Map<String, Object> statistics(@PathVariable Long sessionId) {
        return null;
    }
}
