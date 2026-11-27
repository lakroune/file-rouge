package youcode.ma.SkillCheckAI.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import youcode.ma.SkillCheckAI.dto.responses.AnalyseCodeResponse;
import youcode.ma.SkillCheckAI.dto.responses.ResultatExigenceResponse;
import youcode.ma.SkillCheckAI.enums.StatutAnalyse;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
@Tag(name = "Analyses de code", description = "Gestion des analyses de code")
public class AnalyseCodeController {

    @PostMapping("/livrables/{livrableId}/analyses")
    @Operation(summary = "Déclencher une analyse du code avec DeepSeek")
    public void create(@PathVariable Long livrableId) {
    }

    @GetMapping("/analyses")
    @Operation(summary = "Lister les analyses avec pagination")
    public Page<AnalyseCodeResponse> findAll(
            @RequestParam(required = false) StatutAnalyse statut,
            Pageable pageable
    ) {
        return null;
    }

    @GetMapping("/analyses/{id}")
    @Operation(summary = "Consulter une analyse")
    public AnalyseCodeResponse findById(@PathVariable Long id) {
        return null;
    }

    @GetMapping("/livrables/{livrableId}/analyses")
    @Operation(summary = "Consulter l'historique des analyses")
    public List<AnalyseCodeResponse> findByLivrableId(@PathVariable Long livrableId) {
        return null;
    }

    @GetMapping("/livrables/{livrableId}/analyses/latest")
    @Operation(summary = "Consulter la dernière analyse")
    public AnalyseCodeResponse findLatestByLivrableId(@PathVariable Long livrableId) {
        return null;
    }

    @GetMapping("/analyses/{id}/statut")
    @Operation(summary = "Consulter le statut de l'analyse")
    public StatutAnalyse findStatus(@PathVariable Long id) {
        return null;
    }

    @GetMapping("/analyses/{id}/rapport")
    @Operation(summary = "Consulter le rapport généré par l'IA")
    public String findReport(@PathVariable Long id) {
        return null;
    }

    @GetMapping("/analyses/{id}/resultats-exigences")
    @Operation(summary = "Consulter les résultats des exigences")
    public List<ResultatExigenceResponse> findRequirementResults(@PathVariable Long id) {
        return null;
    }

    @GetMapping("/analyses/{id}/statistiques")
    @Operation(summary = "Consulter les statistiques de conformité")
    public Map<String, Object> statistics(@PathVariable Long id) {
        return null;
    }

    @PostMapping("/analyses/{id}/relancer")
    @Operation(summary = "Relancer une analyse échouée")
    public void retry(@PathVariable Long id) {
    }

    @PatchMapping("/analyses/{id}/annuler")
    @Operation(summary = "Annuler une analyse en cours")
    public void cancel(@PathVariable Long id) {
    }
}
