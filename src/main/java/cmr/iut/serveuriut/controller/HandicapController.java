package cmr.iut.serveuriut.controller;

import cmr.iut.serveuriut.entities.Handicap;
import cmr.iut.serveuriut.service.HandicapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class HandicapController {
    @Autowired
    private HandicapService handicapService;
    @GetMapping("/handicap")
    public List<Handicap> findAllT() {

        return handicapService.findAllT();
    }
    @PostMapping("/handicap")
    public Handicap AddItem(@RequestBody Handicap handicap) {
        return handicapService.AddItem(handicap);
    }
    @GetMapping("/handicap/{id}")
    public Optional<Handicap> findItemById( @PathVariable int id) {
        return handicapService.findItemById(id);
    }
    @DeleteMapping("/handicap/{id}")
    public void deleteById(@PathVariable int id) {
        handicapService.deleteById(id);
    }
}
