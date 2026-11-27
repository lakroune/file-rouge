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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import youcode.ma.SkillCheckAI.dto.requests.LivrableRequest;
import youcode.ma.SkillCheckAI.dto.responses.AnalyseCodeResponse;
import youcode.ma.SkillCheckAI.dto.responses.LivrableResponse;
import youcode.ma.SkillCheckAI.enums.StatutLivrable;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
@Tag(name = "Livrables", description = "Gestion des livrables")
public class LivrableController {

    @PostMapping("/projets/{projetId}/livrables")
    @Operation(summary = "Soumettre un livrable")
    public void create(
            @PathVariable Long projetId,
            @Valid @RequestBody LivrableRequest request
    ) {
    }

    @GetMapping("/livrables")
    @Operation(summary = "Lister les livrables avec pagination")
    public Page<LivrableResponse> findAll(
            @RequestParam(required = false) StatutLivrable statut,
            Pageable pageable
    ) {
        return null;
    }

    @GetMapping("/livrables/{id}")
    @Operation(summary = "Consulter un livrable")
    public LivrableResponse findById(@PathVariable Long id) {
        return null;
    }

    @PutMapping("/livrables/{id}")
    @Operation(summary = "Modifier un livrable")
    public void update(
            @PathVariable Long id,
            @Valid @RequestBody LivrableRequest request
    ) {
    }

    @DeleteMapping("/livrables/{id}")
    @Operation(summary = "Supprimer un livrable")
    public void delete(@PathVariable Long id) {
    }

    @GetMapping("/projets/{projetId}/livrables")
    @Operation(summary = "Lister les livrables d'un projet")
    public List<LivrableResponse> findByProjetId(@PathVariable Long projetId) {
        return null;
    }

    @GetMapping("/apprenants/{apprenantId}/livrables")
    @Operation(summary = "Lister les livrables d'un apprenant")
    public List<LivrableResponse> findByApprenantId(@PathVariable Long apprenantId) {
        return null;
    }

    @GetMapping("/livrables/{id}/github")
    @Operation(summary = "Consulter les informations du repository GitHub")
    public Map<String, Object> githubInformation(@PathVariable Long id) {
        return null;
    }

    @PostMapping("/livrables/{id}/verifier")
    @Operation(summary = "Vérifier l'accessibilité du repository GitHub")
    public void verifyGithub(@PathVariable Long id) {
    }

    @PostMapping("/livrables/{id}/analyses")
    @Operation(summary = "Déclencher l'analyse du code avec DeepSeek")
    public void analyse(@PathVariable Long id) {
    }

    @GetMapping("/livrables/{id}/analyses")
    @Operation(summary = "Consulter l'historique des analyses")
    public List<AnalyseCodeResponse> findAnalyses(@PathVariable Long id) {
        return null;
    }

    @GetMapping("/livrables/{id}/analyses/latest")
    @Operation(summary = "Consulter la dernière analyse")
    public AnalyseCodeResponse findLatestAnalyse(@PathVariable Long id) {
        return null;
    }
}
