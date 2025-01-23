package stage.aratus.inventaire_back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import stage.aratus.inventaire_back.entity.Proprietary;

@Repository
public interface ProprietaryRepository extends JpaRepository<Proprietary, Long> {}