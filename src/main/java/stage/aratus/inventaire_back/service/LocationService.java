package stage.aratus.inventaire_back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import stage.aratus.inventaire_back.entity.Location;
import stage.aratus.inventaire_back.repository.LocationRepository;

@Service
public class LocationService {

    private LocationRepository locationRepository;

    @Autowired                  
    LocationService(LocationRepository locationRepository){
        this.locationRepository = locationRepository;
    }

    public List<Location> getAllLocation(){
        return this.locationRepository.findAll();
    }

    public Location saveLocation(Location location) {
        return locationRepository.save(location);

    }
}
