package youcode.ma.SkillCheckAI.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import youcode.ma.SkillCheckAI.dto.requests.CahierDesChargesRequest;
import youcode.ma.SkillCheckAI.dto.responses.CahierDesChargesResponse;

@RestController
@RequestMapping("/api/v1/projets/{projetId}/cahier-des-charges")
@Tag(name = "Cahiers des charges", description = "Gestion des cahiers des charges")
public class CahierDesChargesController {

    @PostMapping
    @Operation(summary = "Créer un cahier des charges")
    public void create(
            @PathVariable Long projetId,
            @Valid @RequestBody CahierDesChargesRequest request
    ) {
    }

    @GetMapping
    @Operation(summary = "Consulter le cahier des charges")
    public CahierDesChargesResponse findByProjetId(@PathVariable Long projetId) {
        return null;
    }

    @PutMapping
    @Operation(summary = "Modifier le cahier des charges")
    public void update(
            @PathVariable Long projetId,
            @Valid @RequestBody CahierDesChargesRequest request
    ) {
    }

    @DeleteMapping
    @Operation(summary = "Supprimer le cahier des charges")
    public void delete(@PathVariable Long projetId) {
    }
}
