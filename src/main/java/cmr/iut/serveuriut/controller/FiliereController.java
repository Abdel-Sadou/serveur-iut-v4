package cmr.iut.serveuriut.controller;

import cmr.iut.serveuriut.entities.Filiere;
import cmr.iut.serveuriut.service.FiliereService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class FiliereController {
    @Autowired
    private FiliereService filiereService;

    @GetMapping("/filiere")
    public List<Filiere> findAllT() {

        return filiereService.findAllT();
    }
    @PostMapping("/filiere")
    public Filiere AddItem(@RequestBody Filiere filiere) {
        return filiereService.AddItem(filiere);
    }
    @GetMapping("/filiere/{id}")
    public Optional<Filiere> findItem(@PathVariable int id) {
        return filiereService.findItemById(id);
    }
    @DeleteMapping("/filiere/{id}")
    public void deleteById(@PathVariable int id) {
        filiereService.deleteById(id);
    }
}
