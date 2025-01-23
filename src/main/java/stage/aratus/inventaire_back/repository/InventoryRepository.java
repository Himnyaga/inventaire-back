package stage.aratus.inventaire_back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import stage.aratus.inventaire_back.entity.Inventory;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long> {}