package PersonalProject.demo.service;

import PersonalProject.demo.entity.Farmer;
import PersonalProject.demo.repository.farmerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FarmerService {

    private final farmerRepository farmerRepository;

    public Farmer saveFarmer(Farmer farmer) {
        return farmerRepository.save(farmer);
    }

    public List<Farmer> getAllFarmers() {
        return farmerRepository.findAll();
    }

    public Farmer getFarmerById(Long id) {
        return farmerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Farmer not found with id: " + id));
    }


}
