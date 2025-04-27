package org.example.Controller;

import org.example.ParkingRepository;
import org.example.schema.Parking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/parking")
public class ParkingController {

    @Autowired
    private ParkingRepository repository;

    @PostMapping
    public Parking save(@RequestBody Parking parking) {
        return repository.save(parking);

    }

    @GetMapping("/{id}")
    public Optional<Parking> getById(@PathVariable String id) {
        return repository.findById(id);
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        repository.deleteById(id);
    }

    @GetMapping("/search")
    public List<Parking> search(@RequestParam String location) {
        return repository.searchByLocation(location);
    }

    @GetMapping("/exactSearch")
    public List<Parking> exactSearch(@RequestParam String location) {
        return repository.findByLocationExact(location);
    }
}
