package stage.aratus.inventaire_back.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import stage.aratus.inventaire_back.entity.Inventory;
import stage.aratus.inventaire_back.service.InventoryService;

@RestController
@RequestMapping("/api/Inventories")
public class InventoryController {
    private InventoryService inventoryService;
    
    @Autowired
    InventoryController(InventoryService inventoryService){
        this.inventoryService = inventoryService;
    }
    @GetMapping
public List<Inventory> getAllInventories() {
return inventoryService.getAllInventory();
}

@PostMapping
public Inventory createInventory(@RequestBody Inventory inventory) {
    return inventoryService.saveInventory(inventory);
}
// Autres points de terminaison CRUD (PUT, DELETE) peuvent être ajoutés ici
}
