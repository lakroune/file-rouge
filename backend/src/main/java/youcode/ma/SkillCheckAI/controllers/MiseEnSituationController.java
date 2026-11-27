package youcode.ma.SkillCheckAI.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import youcode.ma.SkillCheckAI.dto.requests.MiseEnSituationRequest;
import youcode.ma.SkillCheckAI.dto.responses.CompetenceResponse;
import youcode.ma.SkillCheckAI.dto.responses.MiseEnSituationResponse;
import youcode.ma.SkillCheckAI.enums.TypeMiseEnSituation;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
@Tag(name = "Mises en situation", description = "Gestion des mises en situation")
public class MiseEnSituationController {

    @PostMapping("/sessions/{sessionId}/mise-en-situation")
    @Operation(summary = "Créer manuellement une mise en situation")
    public void create(
            @PathVariable Long sessionId,
            @Valid @RequestBody MiseEnSituationRequest request
    ) {
    }

    @GetMapping("/mises-en-situation")
    @Operation(summary = "Lister les mises en situation avec pagination")
    public Page<MiseEnSituationResponse> findAll(
            @RequestParam(required = false) TypeMiseEnSituation type,
            Pageable pageable
    ) {
        return null;
    }

    @GetMapping("/mises-en-situation/{id}")
    @Operation(summary = "Consulter une mise en situation")
    public MiseEnSituationResponse findById(@PathVariable Long id) {
        return null;
    }

    @PutMapping("/mises-en-situation/{id}")
    @Operation(summary = "Modifier une mise en situation")
    public void update(
            @PathVariable Long id,
            @Valid @RequestBody MiseEnSituationRequest request
    ) {
    }

    @DeleteMapping("/mises-en-situation/{id}")
    @Operation(summary = "Supprimer une mise en situation")
    public void delete(@PathVariable Long id) {
    }

    @GetMapping("/sessions/{sessionId}/mise-en-situation")
    @Operation(summary = "Consulter la mise en situation d'une session")
    public MiseEnSituationResponse findBySessionId(@PathVariable Long sessionId) {
        return null;
    }

    @PostMapping("/mises-en-situation/{id}/competences/{competenceId}")
    @Operation(summary = "Associer une compétence")
    public void addCompetence(
            @PathVariable Long id,
            @PathVariable Long competenceId
    ) {
    }

    @DeleteMapping("/mises-en-situation/{id}/competences/{competenceId}")
    @Operation(summary = "Retirer une compétence")
    public void removeCompetence(
            @PathVariable Long id,
            @PathVariable Long competenceId
    ) {
    }

    @GetMapping("/mises-en-situation/{id}/competences")
    @Operation(summary = "Lister les compétences évaluées")
    public List<CompetenceResponse> findCompetences(@PathVariable Long id) {
        return null;
    }

    @PatchMapping("/mises-en-situation/{id}/bareme")
    @Operation(summary = "Modifier le barème")
    public void updateScore(
            @PathVariable Long id,
            @RequestBody BigDecimal bareme
    ) {
    }

    @PostMapping("/mises-en-situation/{id}/regenerer")
    @Operation(summary = "Régénérer la mise en situation avec DeepSeek")
    public void regenerate(@PathVariable Long id) {
    }
}
