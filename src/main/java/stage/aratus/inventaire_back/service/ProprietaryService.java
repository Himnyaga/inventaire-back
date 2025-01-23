package stage.aratus.inventaire_back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import stage.aratus.inventaire_back.entity.Proprietary;
import stage.aratus.inventaire_back.repository.ProprietaryRepository;

@Service
public class ProprietaryService {
    
    private ProprietaryRepository proprietaryRepository;

    @Autowired
    ProprietaryService(ProprietaryRepository proprietaryRepository){
        this.proprietaryRepository = proprietaryRepository;
    }

    public List<Proprietary> getAllProprietary(){
        return this.proprietaryRepository.findAll();
    }

    public Proprietary saveProprietary( Proprietary proprietary) {
        return proprietaryRepository.save(proprietary);
    }
}
