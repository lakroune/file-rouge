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
import youcode.ma.SkillCheckAI.dto.requests.ProjetRequest;
import youcode.ma.SkillCheckAI.dto.responses.CompetenceResponse;
import youcode.ma.SkillCheckAI.dto.responses.ProjetResponse;
import youcode.ma.SkillCheckAI.enums.StatutProjet;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
@Tag(name = "Projets", description = "Gestion des projets")
public class ProjetController {

    @PostMapping("/projets")
    @Operation(summary = "Créer un projet")
    public void create(@Valid @RequestBody ProjetRequest request) {
    }

    @GetMapping("/projets")
    @Operation(summary = "Lister les projets avec pagination")
    public Page<ProjetResponse> findAll(
            @RequestParam(required = false) StatutProjet statut,
            @RequestParam(required = false) String search,
            Pageable pageable
    ) {
        return null;
    }

    @GetMapping("/projets/{id}")
    @Operation(summary = "Consulter un projet")
    public ProjetResponse findById(@PathVariable Long id) {
        return null;
    }

    @PutMapping("/projets/{id}")
    @Operation(summary = "Modifier un projet")
    public void update(
            @PathVariable Long id,
            @Valid @RequestBody ProjetRequest request
    ) {
    }

    @PatchMapping("/projets/{id}")
    @Operation(summary = "Modifier partiellement un projet")
    public void partialUpdate(
            @PathVariable Long id,
            @RequestBody ProjetRequest request
    ) {
    }

    @DeleteMapping("/projets/{id}")
    @Operation(summary = "Supprimer un projet")
    public void delete(@PathVariable Long id) {
    }

    @PatchMapping("/projets/{id}/publier")
    @Operation(summary = "Publier un projet")
    public void publish(@PathVariable Long id) {
    }

    @PatchMapping("/projets/{id}/archiver")
    @Operation(summary = "Archiver un projet")
    public void archive(@PathVariable Long id) {
    }

    @PatchMapping("/projets/{id}/cloturer")
    @Operation(summary = "Clôturer un projet")
    public void close(@PathVariable Long id) {
    }

    @GetMapping("/formateurs/{id}/projets")
    @Operation(summary = "Lister les projets d'un formateur")
    public List<ProjetResponse> findByFormateurId(@PathVariable Long id) {
        return null;
    }

    @GetMapping("/promotions/{id}/projets")
    @Operation(summary = "Lister les projets d'une promotion")
    public List<ProjetResponse> findByPromotionId(@PathVariable Long id) {
        return null;
    }

    @GetMapping("/apprenants/{id}/projets")
    @Operation(summary = "Lister les projets d'un apprenant")
    public List<ProjetResponse> findByApprenantId(@PathVariable Long id) {
        return null;
    }

    @PostMapping("/projets/{id}/promotions/{promotionId}")
    @Operation(summary = "Affecter un projet à une promotion")
    public void addPromotion(
            @PathVariable Long id,
            @PathVariable Long promotionId
    ) {
    }

    @DeleteMapping("/projets/{id}/promotions/{promotionId}")
    @Operation(summary = "Retirer une promotion du projet")
    public void removePromotion(
            @PathVariable Long id,
            @PathVariable Long promotionId
    ) {
    }

    @PostMapping("/projets/{id}/competences/{competenceId}")
    @Operation(summary = "Associer une compétence au projet")
    public void addCompetence(
            @PathVariable Long id,
            @PathVariable Long competenceId
    ) {
    }

    @DeleteMapping("/projets/{id}/competences/{competenceId}")
    @Operation(summary = "Retirer une compétence du projet")
    public void removeCompetence(
            @PathVariable Long id,
            @PathVariable Long competenceId
    ) {
    }

    @GetMapping("/projets/{id}/competences")
    @Operation(summary = "Lister les compétences du projet")
    public List<CompetenceResponse> findCompetences(@PathVariable Long id) {
        return null;
    }

    @GetMapping("/projets/{id}/statistiques")
    @Operation(summary = "Consulter les statistiques du projet")
    public Map<String, Object> statistics(@PathVariable Long id) {
        return null;
    }
}
