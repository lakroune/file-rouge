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
import youcode.ma.SkillCheckAI.dto.requests.ExigenceRequest;
import youcode.ma.SkillCheckAI.dto.responses.ExigenceResponse;

import java.util.List;

@RestController
@Tag(name = "Exigences", description = "Gestion des exigences")
public class ExigenceController {

    @PostMapping("/api/v1/cahiers-des-charges/{id}/exigences")
    @Operation(summary = "Ajouter une exigence")
    public void create(
            @PathVariable Long id,
            @Valid @RequestBody ExigenceRequest request
    ) {
    }

    @GetMapping("/api/v1/cahiers-des-charges/{id}/exigences")
    @Operation(summary = "Lister les exigences")
    public List<ExigenceResponse> findByCahierDesChargesId(@PathVariable Long id) {
        return null;
    }

    @GetMapping("/api/v1/exigences/{id}")
    @Operation(summary = "Consulter une exigence")
    public ExigenceResponse findById(@PathVariable Long id) {
        return null;
    }

    @PutMapping("/api/v1/exigences/{id}")
    @Operation(summary = "Modifier une exigence")
    public void update(
            @PathVariable Long id,
            @Valid @RequestBody ExigenceRequest request
    ) {
    }

    @DeleteMapping("/api/v1/exigences/{id}")
    @Operation(summary = "Supprimer une exigence")
    public void delete(@PathVariable Long id) {
    }
}
