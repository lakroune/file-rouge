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
import youcode.ma.SkillCheckAI.dto.requests.SolutionRequest;
import youcode.ma.SkillCheckAI.dto.responses.SolutionResponse;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
@Tag(name = "Solutions", description = "Gestion des solutions")
public class SolutionController {

    @PostMapping("/mises-en-situation/{id}/solution")
    @Operation(summary = "Soumettre une solution")
    public void create(
            @PathVariable Long id,
            @Valid @RequestBody SolutionRequest request
    ) {
    }

    @GetMapping("/solutions")
    @Operation(summary = "Lister les solutions avec pagination")
    public Page<SolutionResponse> findAll(Pageable pageable) {
        return null;
    }

    @GetMapping("/solutions/{id}")
    @Operation(summary = "Consulter une solution")
    public SolutionResponse findById(@PathVariable Long id) {
        return null;
    }

    @PutMapping("/solutions/{id}")
    @Operation(summary = "Modifier une solution avant son évaluation")
    public void update(
            @PathVariable Long id,
            @Valid @RequestBody SolutionRequest request
    ) {
    }

    @DeleteMapping("/solutions/{id}")
    @Operation(summary = "Supprimer une solution avant son évaluation")
    public void delete(@PathVariable Long id) {
    }

    @GetMapping("/mises-en-situation/{id}/solution")
    @Operation(summary = "Consulter la solution d'une mise en situation")
    public SolutionResponse findByMiseEnSituationId(@PathVariable Long id) {
        return null;
    }

    @GetMapping("/sessions/{sessionId}/solution")
    @Operation(summary = "Consulter la solution d'une session")
    public SolutionResponse findBySessionId(@PathVariable Long sessionId) {
        return null;
    }

    @GetMapping("/apprenants/{apprenantId}/solutions")
    @Operation(summary = "Lister les solutions d'un apprenant")
    public List<SolutionResponse> findByApprenantId(@PathVariable Long apprenantId) {
        return null;
    }

    @PostMapping("/solutions/{id}/evaluer")
    @Operation(summary = "Évaluer la solution avec DeepSeek")
    public void evaluate(@PathVariable Long id) {
    }

    @GetMapping("/solutions/{id}/feedback")
    @Operation(summary = "Consulter le feedback de l'IA")
    public String findFeedback(@PathVariable Long id) {
        return null;
    }

    @GetMapping("/solutions/{id}/note")
    @Operation(summary = "Consulter la note obtenue")
    public BigDecimal findNote(@PathVariable Long id) {
        return null;
    }
}
