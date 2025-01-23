package stage.aratus.inventaire_back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import stage.aratus.inventaire_back.entity.Inventory;
import stage.aratus.inventaire_back.repository.InventoryRepository;

@Service
public class InventoryService {

    private InventoryRepository inventoryRepository;

    @Autowired                  
    InventoryService(InventoryRepository inventoryRepository){
        this.inventoryRepository = inventoryRepository;
    }

    public List<Inventory> getAllInventory(){
        return this.inventoryRepository.findAll();
    }

    public Inventory saveInventory(Inventory inventory) {
        return inventoryRepository.save(inventory);

    }
}
