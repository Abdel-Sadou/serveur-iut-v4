package cmr.iut.serveuriut.controller;

import cmr.iut.serveuriut.entities.Tuteur;
import cmr.iut.serveuriut.service.impl.TuteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("admin")
public class TuteurController {
    @Autowired
    private TuteurService tuteurService;
    @GetMapping("/tuteur")
    public List<Tuteur> findAllT() {
        return tuteurService.findAllT();
    }
    @PostMapping("/tuteur")
    public Tuteur addItem(@RequestBody Tuteur i) {
        return tuteurService.addItem(i);
    }
    @GetMapping("/tuteur/{id}")
    public Optional<Tuteur> findItemById(@PathVariable  Long aLong) {
        return tuteurService.findItemById(aLong);
    }

    @DeleteMapping("/tuteur/{id}")
    public void deleteById(@PathVariable Long aLong) {
        tuteurService.deleteById(aLong);
    }
}
