package stage.aratus.inventaire_back.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import stage.aratus.inventaire_back.entity.Location;
import stage.aratus.inventaire_back.service.LocationService;

@RestController
@RequestMapping("/api/Locations")
public class LocationController {
    private LocationService locationService;
    
    @Autowired
    LocationController(LocationService locationService){
        this.locationService = locationService;
    }
    @GetMapping
public List<Location> getAllLocations() {
return locationService.getAllLocation();
}

@PostMapping
public Location createLocation(@RequestBody Location location) {
    return locationService.saveLocation(location);
}
// Autres points de terminaison CRUD (PUT, DELETE) peuvent être ajoutés ici
}
