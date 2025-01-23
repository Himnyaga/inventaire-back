package stage.aratus.inventaire_back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import stage.aratus.inventaire_back.entity.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {}