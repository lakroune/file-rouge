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
import youcode.ma.SkillCheckAI.dto.requests.FormateurRequest;
import youcode.ma.SkillCheckAI.dto.responses.ApprenantResponse;
import youcode.ma.SkillCheckAI.dto.responses.FormateurResponse;
import youcode.ma.SkillCheckAI.dto.responses.PromotionResponse;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
@Tag(name = "Formateurs", description = "Gestion des formateurs")
public class FormateurController {

    @PostMapping("/formateurs")
    @Operation(summary = "Créer un formateur")
    public void create(@Valid @RequestBody FormateurRequest request) {
    }

    @GetMapping("/formateurs")
    @Operation(summary = "Lister les formateurs avec pagination")
    public Page<FormateurResponse> findAll(
            @RequestParam(required = false) String search,
            @RequestParam(required = false) String specialite,
            Pageable pageable
    ) {
        return null;
    }

    @GetMapping("/formateurs/{id}")
    @Operation(summary = "Consulter un formateur")
    public FormateurResponse findById(@PathVariable Long id) {
        return null;
    }

    @PutMapping("/formateurs/{id}")
    @Operation(summary = "Modifier un formateur")
    public void update(
            @PathVariable Long id,
            @Valid @RequestBody FormateurRequest request
    ) {
    }

    @PatchMapping("/formateurs/{id}")
    @Operation(summary = "Modifier partiellement un formateur")
    public void partialUpdate(
            @PathVariable Long id,
            @RequestBody FormateurRequest request
    ) {
    }

    @DeleteMapping("/formateurs/{id}")
    @Operation(summary = "Supprimer un formateur")
    public void delete(@PathVariable Long id) {
    }

    @GetMapping("/formateurs/{id}/promotions")
    @Operation(summary = "Lister les promotions du formateur")
    public List<PromotionResponse> findPromotions(@PathVariable Long id) {
        return null;
    }

    @PostMapping("/formateurs/{id}/promotions/{promotionId}")
    @Operation(summary = "Affecter une promotion au formateur")
    public void addPromotion(
            @PathVariable Long id,
            @PathVariable Long promotionId
    ) {
    }

    @DeleteMapping("/formateurs/{id}/promotions/{promotionId}")
    @Operation(summary = "Retirer une promotion")
    public void removePromotion(
            @PathVariable Long id,
            @PathVariable Long promotionId
    ) {
    }

    @GetMapping("/formateurs/{id}/apprenants")
    @Operation(summary = "Lister les apprenants encadrés")
    public List<ApprenantResponse> findApprenants(@PathVariable Long id) {
        return null;
    }

    @GetMapping("/formateurs/{id}/dashboard")
    @Operation(summary = "Consulter le tableau de bord")
    public Map<String, Object> dashboard(@PathVariable Long id) {
        return null;
    }

    @GetMapping("/formateurs/{id}/statistiques")
    @Operation(summary = "Consulter les statistiques du formateur")
    public Map<String, Object> statistics(@PathVariable Long id) {
        return null;
    }
}
