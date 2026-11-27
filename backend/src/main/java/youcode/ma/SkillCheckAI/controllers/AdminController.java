package youcode.ma.SkillCheckAI.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import youcode.ma.SkillCheckAI.dto.requests.AdminRequest;
import youcode.ma.SkillCheckAI.dto.responses.AdminResponse;
import youcode.ma.SkillCheckAI.services.AdminService;

@RestController
@RequestMapping("/api/admins")
@Tag(name = "Administrateurs", description = "Gestion des administrateurs")
@RequiredArgsConstructor
public class AdminController {

    private final AdminService adminService;


   
}
