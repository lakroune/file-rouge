package youcode.ma.SkillCheckAI.controllers;

import java.util.List;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import youcode.ma.SkillCheckAI.dto.responses.ApprenantResponse;
import youcode.ma.SkillCheckAI.mappers.ApprenantMapper;
import youcode.ma.SkillCheckAI.services.ApprenantService;

@RestController
@RequestMapping("/api/apprenants")
@Tag(name = "Apprenants", description = "Gestion des apprenants")
@RequiredArgsConstructor
public class ApprenantController {

    private final ApprenantService apprenantService;
 

}
