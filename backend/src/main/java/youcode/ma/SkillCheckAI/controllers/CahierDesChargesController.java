package youcode.ma.SkillCheckAI.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
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
import org.springframework.web.multipart.MultipartFile;
import youcode.ma.SkillCheckAI.dto.requests.CahierDesChargesRequest;
import youcode.ma.SkillCheckAI.dto.responses.CahierDesChargesResponse;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@Tag(name = "Cahiers des charges", description = "Gestion des cahiers des charges")
public class CahierDesChargesController {

    @PostMapping("/projets/{projetId}/cahier-des-charges")
    @Operation(summary = "Créer un cahier des charges")
    public void create(
            @PathVariable Long projetId,
            @Valid @RequestBody CahierDesChargesRequest request
    ) {
    }

    @GetMapping("/projets/{projetId}/cahier-des-charges")
    @Operation(summary = "Consulter le cahier des charges d'un projet")
    public CahierDesChargesResponse findByProjetId(@PathVariable Long projetId) {
        return null;
    }

    @PutMapping("/projets/{projetId}/cahier-des-charges")
    @Operation(summary = "Modifier le cahier des charges d'un projet")
    public void updateByProjetId(
            @PathVariable Long projetId,
            @Valid @RequestBody CahierDesChargesRequest request
    ) {
    }

    @DeleteMapping("/projets/{projetId}/cahier-des-charges")
    @Operation(summary = "Supprimer le cahier des charges d'un projet")
    public void deleteByProjetId(@PathVariable Long projetId) {
    }

    @GetMapping("/cahiers-des-charges")
    @Operation(summary = "Lister les cahiers des charges accessibles")
    public List<CahierDesChargesResponse> findAll() {
        return null;
    }

    @GetMapping("/cahiers-des-charges/{id}")
    @Operation(summary = "Rechercher un cahier des charges par ID")
    public CahierDesChargesResponse findById(@PathVariable Long id) {
        return null;
    }

    @PatchMapping("/cahiers-des-charges/{id}")
    @Operation(summary = "Modifier partiellement un cahier des charges")
    public void patch(
            @PathVariable Long id,
            @RequestBody CahierDesChargesRequest request
    ) {
    }

    @PostMapping("/projets/{projetId}/cahier-des-charges/import")
    @Operation(summary = "Importer un cahier des charges PDF")
    public void importPdf(
            @PathVariable Long projetId,
            @RequestParam("file") MultipartFile file
    ) {
    }

    @GetMapping("/cahiers-des-charges/{id}/download")
    @Operation(summary = "Télécharger le cahier des charges")
    public byte[] download(@PathVariable Long id) {
        return null;
    }

    @PostMapping("/cahiers-des-charges/{id}/analyser")
    @Operation(summary = "Analyser le cahier des charges avec l'IA")
    public void analyser(@PathVariable Long id) {
    }

    @PostMapping("/cahiers-des-charges/{id}/generer-exigences")
    @Operation(summary = "Générer les exigences avec DeepSeek")
    public void genererExigences(@PathVariable Long id) {
    }
}
