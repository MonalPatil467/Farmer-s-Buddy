package PersonalProject.demo.controller;

import PersonalProject.demo.entity.Farmer;
import PersonalProject.demo.service.FarmerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/farmers")
@RequiredArgsConstructor
public class FarmerController {

    private final FarmerService farmerService;

    @PostMapping
    public ResponseEntity<Farmer> createFarmer(@RequestBody Farmer farmer) {
        Farmer savedFarmer = farmerService.saveFarmer(farmer);
        return new ResponseEntity<>(savedFarmer, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Farmer>> getAllFarmers() {
        List<Farmer> farmers = farmerService.getAllFarmers();
        return ResponseEntity.ok(farmers);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Farmer> getFarmerById(@PathVariable Long id) {
        Farmer farmer = farmerService.getFarmerById(id);
        return ResponseEntity.ok(farmer);
    }



}
