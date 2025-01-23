package stage.aratus.inventaire_back.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//TODO create post method to save owner

import stage.aratus.inventaire_back.entity.Proprietary;
import stage.aratus.inventaire_back.service.ProprietaryService;

@RestController
@RequestMapping("/api/Owners")
public class OwnerController {
    private ProprietaryService proprietaryService;
    
    @Autowired
    OwnerController(ProprietaryService proprietaryService){
        this.proprietaryService = proprietaryService;
    }
    @GetMapping
public List<Proprietary> getAllProprietaries() {
return proprietaryService.getAllProprietary();
}

@PostMapping
public Proprietary createProprietary(@RequestBody Proprietary proprietary) {
    return proprietaryService.saveProprietary(proprietary);
}
// Autres points de terminaison CRUD (PUT, DELETE) peuvent être ajoutés ici
}
