package youcode.ma.SkillCheckAI.controllers;

import java.util.List;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import youcode.ma.SkillCheckAI.entities.Apprenant;
import youcode.ma.SkillCheckAI.services.ApprenantService;

@RestController
@RequestMapping("/api/apprenants")
@Tag(name = "Apprenants", description = "Gestion des apprenants")
@RequiredArgsConstructor
public class ApprenantController {

    private final ApprenantService apprenantService;

    @GetMapping
    @Operation(
            summary = "Lister les apprenants",
            description = "Récupère la liste de tous les apprenants enregistrés"
    )
    public List<Apprenant> findAll() {
        return apprenantService.findAll();
    }

}
