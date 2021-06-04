package cmr.iut.serveuriut.controller;

import cmr.iut.serveuriut.entities.Tuteur;
import cmr.iut.serveuriut.service.TuteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

public class TuteurController {
    @Autowired
    private TuteurService tuteurService;
    @GetMapping("/tuteurs")
    public List<Tuteur> findAllT() {
        return tuteurService.findAllT();
    }
    @PostMapping("/tuteurs")
    public Tuteur AddItem(@RequestBody Tuteur tuteur) {
        return tuteurService.AddItem(tuteur);
    }
    @GetMapping("/tuteurs/{id}")
    public Optional<Tuteur> findItemById(@PathVariable int id) {
        return tuteurService.findItemById(id);
    }
    @DeleteMapping("/tuteurs/{id}")
    public void deleteById(@PathVariable int id) {
        tuteurService.deleteById(id);
    }
}
